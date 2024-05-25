package com.task;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class BookIndexer {
    public static void main(String[] args) {
        try {
            // Read exclude words
            Set<String> excludeWords = FileReaderHelper.readExcludeWords("F:\\mithi\\exclude-words.txt");

            // Read pages and index words
            WordIndexer indexer = new WordIndexer(excludeWords);
            indexer.readAndIndexPage("F:\\mithi\\page1.txt", 1);
            indexer.readAndIndexPage("F:\\mithi\\page2.txt", 2);
            indexer.readAndIndexPage("F:\\mithi\\page3.txt", 3);

            // Write the index to the output file
            indexer.writeIndexToFile("F:\\mithi\\index.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileReaderHelper {
    public static Set<String> readExcludeWords(String filePath) throws IOException {
        Set<String> excludeWords = new HashSet<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            excludeWords.add(line.trim().toLowerCase());
        }
        return excludeWords;
    }

    public static List<String> readPage(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}

class WordIndexer {
    private Set<String> excludeWords;
    private Map<String, Set<Integer>> wordIndex;

    public WordIndexer(Set<String> excludeWords) {
        this.excludeWords = excludeWords;
        this.wordIndex = new HashMap<>();
    }

    public void readAndIndexPage(String filePath, int pageNumber) throws IOException {
        List<String> lines = FileReaderHelper.readPage(filePath);
        Pattern pattern = Pattern.compile("[\\w'\\-]+|•|\"calendar|-");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line.toLowerCase());
            while (matcher.find()) {
                String word = matcher.group();
                if (!excludeWords.contains(word) && !isNumeric(word)) {
                    wordIndex.computeIfAbsent(word, k -> new HashSet<>()).add(pageNumber);
                }
            }
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public void writeIndexToFile(String filePath) throws IOException {
        List<String> outputLines = new ArrayList<>();
        List<String> sortedWords = new ArrayList<>(wordIndex.keySet());
        Collections.sort(sortedWords);

        List<String> specialEntries = Arrays.asList("•", "\"calendar", "-");
        sortedWords.removeAll(specialEntries);

        outputLines.add("Word : Page Numbers\r\n"
		        + "-------------------");
        for (String word : sortedWords) {
            Set<Integer> pages = wordIndex.get(word);
            String pagesString = String.join(",", pages.stream().map(String::valueOf).toArray(String[]::new));
            outputLines.add(word + " : " + pagesString);
        }

        // Add special entries at the end
        for (String special : specialEntries) {
            Set<Integer> pages = wordIndex.get(special);
            if (pages != null) {
                String pagesString = String.join(",", pages.stream().map(String::valueOf).toArray(String[]::new));
                outputLines.add(special + " : " + pagesString);
            }
        }

        Files.write(Paths.get(filePath), outputLines);
    }
}
