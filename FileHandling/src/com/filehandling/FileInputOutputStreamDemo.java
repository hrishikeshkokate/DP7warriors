package com.filehandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamDemo {
	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			String data="I study in Think Quotient";
			
			FileOutputStream fout= new FileOutputStream(f);
			
			byte[] arr=data.getBytes();
			
			fout.write(arr);
			System.out.println("Data added.....");
			fout.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void readData(File f)
	{
		try
		{
			if (f.exists()) {
				FileInputStream fin = new FileInputStream(f);

				int i = 0;
				
				while((i=fin.read())!=-1)
				{
					System.out.print((char)i);
					
				}
				
				fin.close();

			}
			else
			{
				System.out.println("File doesnot exist....");
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		FileInputOutputStreamDemo obj = new FileInputOutputStreamDemo();
		
		File f1= new File("D:\\DP7Warriors\\MyFiles\\lab.txt");
		//obj.writeData(f1);
		obj.readData(f1);
		
	}

}
