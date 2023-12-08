package com.filehandling;



import java.io.File;


public class FileDelete {
	
	public void deleteFile(File f)
	{
		try
		{
			if(f.exists())
			{
			   if(f.delete())
			   {
				   System.out.println(f.getName()+" is deleted");
			   }
			   else
			   {
				   System.out.println("Error..");
			   }
			}
			else
			{
				System.out.println("File not found...");
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		FileDelete obj = new FileDelete();
		
		File f1= new File("D:\\DP7Warriors\\MyFiles\\fileio.txt");
		
		obj.deleteFile(f1);
		
	}

}
