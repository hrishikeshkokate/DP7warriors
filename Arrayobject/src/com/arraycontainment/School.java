package com.arraycontainment;
class Course
{
	private int id;
	private String coursename;
	private int fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String coursename, int fees) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", fees=" + fees + "]";
	}
		
}
class Student
{
	private int id;
	private String sname;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, Course course) {
		super();
		this.id = id;
		this.sname = sname;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", course=" + course + "]";
	}
	
}
public class School {
	
	static void countstudentcoursewise(Student[] st,Course[] cour)
	{
		int count;
		for(Course c:cour)
		{
			count=0;
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					count++;
				}
			}
			System.out.println(c+" :no of student-->"+count);
		}
	}

	public static void main(String[] args) {
		
//		Course c1=new Course(101,"java",34000);
//		Course c2=new Course(102,".net",55000);
		
		Course co[]=new Course[3];
		co[0]=new Course(101,"java",35000);
		co[1]=new Course(102,"java script",55000);
		co[2]=new Course(103,".net",25000);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"Anuj",co[1]);
		stud[1]=new Student(2,"Suraj",co[2]);
		stud[2]=new Student(3,"Aniket",co[0]);
		
		//hard code getter setter
		
		stud[3]=new Student();
		stud[3].setId(4);
		stud[3].setSname("Hrishikesh");
		stud[3].setCourse(co[2]);
		
//		for(Student s:stud)
//		{
//			System.out.println(s);
//		}
		countstudentcoursewise(stud, co);
	}
}
