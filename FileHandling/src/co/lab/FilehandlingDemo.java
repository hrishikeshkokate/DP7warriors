package co.lab;

import java.io.File;
import java.io.FileInputStream;

public class FilehandlingDemo {

	public static void main(String[] args) {
		
		File f1=new File("F:\\TQ\\FileHandling\\lab.txt");
		int j;
		try {
			FileInputStream fis=new FileInputStream(f1);
			while((j=fis.read()) !=-1)
			{
				System.out.print((char)j);
			}
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
