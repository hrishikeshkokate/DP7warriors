package com.cutomexception;

class NegativeMarksException extends RuntimeException
{
	public NegativeMarksException(String message)
	{
		super(message);
	}
}

class Student 
{
	private int[] subjectMarks = new int[5];

	public void setMarks(int[] marks) throws NegativeMarksException 
	{
		for (int i = 0; i < marks.length; i++)
		{
			if (marks[i] < 0) 
			{
				throw new NegativeMarksException("Marks for subject " + (i +1) + " cannot be negative.");
			}
			subjectMarks[i] = marks[i];
		}
	}

	public void displayMarks()
	{
		System.out.println("Subject-wise marks:");
		for (int i = 0; i < subjectMarks.length; i++) 
		{
			System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
		}
	}
	public double calculatePercentage() 
	{
        int totalMarks = 0;
        for (int mark : subjectMarks) 
        {
            totalMarks += mark;
        }
        double percentage = ((double) totalMarks / (subjectMarks.length * 100)) * 100;
        return percentage;
    }
}

public class CustomExceptionExample 
{
	public static void main(String[] args) 
	{
		Student student = new Student();
		int[] marks = { 90, 85, 92, -75, 78 };

		try 
		{
			student.setMarks(marks);
			student.displayMarks();
		}
		catch (NegativeMarksException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		double percentage = student.calculatePercentage();
        System.out.println("Percentage: " + percentage + "%");
	}
}
