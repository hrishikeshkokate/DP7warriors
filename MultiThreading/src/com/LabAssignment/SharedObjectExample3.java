package com.LabAssignment;

class Student {
	private int id;
	private String name;
	public Student() {
		super();
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

class StudentNameUpdater implements Runnable {
	private final Student student;
	private final String threadName;

	public StudentNameUpdater(Student student, String threadName) {
		this.student = student;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) 
		{
			String newName = student.getName() + "_UpdatedBy_" + threadName;
			student.setName(newName);
			System.out.println(threadName + " updated name to: " + newName);

			try
			{
				Thread.sleep(100); 
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class SharedObjectExample3 {
	public static void main(String[] args) {
		
		Student sharedStudent = new Student(101,"John");

		Thread threadA = new Thread(new StudentNameUpdater(sharedStudent, "ThreadA"));
		Thread threadB = new Thread(new StudentNameUpdater(sharedStudent, "ThreadB"));

		threadA.start();
		threadB.start();
	}
}
