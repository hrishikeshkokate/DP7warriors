package co.lab;

import java.io.FileReader;
import java.io.IOException;

public class FilehandlingDemo1 {

	public static void main(String[] args) {

		FileReader fr = null;
		try
		{
			fr = new FileReader("F:\\TQ\\FileHandling\\lab.txt");
			int temp;

			while ((temp = fr.read()) != -1) {
				System.out.print((char) temp);
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
		}
	}
}
