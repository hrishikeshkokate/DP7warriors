package co.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeObjectReadWrite {

	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Suraj");
		
		try {
			FileOutputStream fos=new FileOutputStream("F:\\TQ\\FileHandling\\Serialization.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("Serialization completed ");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fis=new FileInputStream("F:\\TQ\\FileHandling\\Serialization.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp2=(Employee) ois.readObject();
			System.out.println(emp2);
			ois.close();
			fis.close();
			System.out.println("Deserialization completed ");
			
		} catch (Exception e) {
			System.out.println(e);		}

	}

}
