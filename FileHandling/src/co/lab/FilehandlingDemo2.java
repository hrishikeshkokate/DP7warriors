package co.lab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandlingDemo2 {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw=null;
		try
		{
			fr = new FileReader("F:\\TQ\\FileHandling\\lab.txt");
			fw=new FileWriter("F:\\TQ\\FileHandling\\lab2.txt");
			int temp;

			while ((temp = fr.read()) != -1) {
				System.out.print((char) temp);
				fw.write(temp);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		} 
		finally 
		{
			if (fr != null) 
			{
				try 
				{
					fr.close();
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if (fw != null) 
			{
				try 
				{
					fw.close();
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
