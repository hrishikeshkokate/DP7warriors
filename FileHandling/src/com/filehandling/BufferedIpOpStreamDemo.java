package com.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedIpOpStreamDemo {

	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			String data="Welcome to java learning";
			FileOutputStream fout=new FileOutputStream(f);
			
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			byte[] arr=data.getBytes();
			
			bout.write(arr);
			System.out.println("Data added...");
			bout.close();
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
				
				BufferedInputStream bin= new BufferedInputStream(new FileInputStream(f));
				
				int i = 0;
				
				while((i=bin.read())!=-1)
				{
					System.out.print((char)i);
					
				}
				
				bin.close();

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
		BufferedIpOpStreamDemo obj = new BufferedIpOpStreamDemo();
		
		File f1= new File("F:\\TQ\\FileHandling\\first.txt");
		obj.writeData(f1);
		obj.readData(f1);

	}

}
