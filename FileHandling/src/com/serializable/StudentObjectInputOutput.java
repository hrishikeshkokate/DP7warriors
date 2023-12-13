package com.serializable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentObjectInputOutput {
	
	static Scanner sc= new Scanner(System.in);
	
	public void readData(File f)
	{
		try {
			
			if(f.exists())
			{
				ObjectInputStream oin= new ObjectInputStream(new FileInputStream(f));
				for(int i=0;i<3;i++)
				{
					Student stud=(Student) oin.readObject();
					System.out.println(stud);
				}
				
				oin.close();
				
			}
			else
			{
				System.out.println("File doesnot exists.......");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void writeStudentData(File f) {
		try {

			if (f.exists()) {
				f.createNewFile();
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ObjectOutputStream oout= new ObjectOutputStream(new FileOutputStream(f));
			Student s[]= new Student[3];
			for(int i=0;i<s.length;i++)
			{
				s[i]= new Student();
				System.out.println("Enter student id:");
				s[i].setId(sc.nextInt());
				
				System.out.println("Enter student name:");
				s[i].setName(br.readLine());
				
				System.out.println("Enter marks:");
				s[i].setMarks(sc.nextDouble());
				
				oout.writeObject(s[i]);
				System.out.println("Student "+(i+1)+"is added .........");
				
			}
				
			System.out.println("------------------------------------------------");
			oout.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		StudentObjectInputOutput st = new StudentObjectInputOutput();
		File f1 = new File("D:\\DP7Warriors\\MyFiles\\studentdata.txt");
		
		//st.writeStudentData(f1);
		st.readData(f1);

		sc.close();
	}

}
