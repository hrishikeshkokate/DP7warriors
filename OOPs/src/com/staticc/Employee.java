package com.staticc;

 class Employee {
	private int eId;
	private String eName;
	private float eSalary;
	private static String scName;

	static {
		scName = "Wipro";
	}

	static void changename(String scName) {

		scName = scName;
	}

	Employee() {

	}

	Employee(int eId, String eName, float eSalar) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;

	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

	public static String getScName() {
		return scName;
	}

	public static void setScName(String scName) {
		Employee.scName = scName;
	}

	public static void newbrand(String scName) {

	}

	public static String getBrandName() {
		return scName;
	}

	public String toString() {
		return "eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "";
	}


	//public class Employee {

		public static void main(String[] args) {

			Employee e1 = new Employee(101,"Aniket",16000);
			Employee e2 = new Employee(102,"Hrishi",19000);
			Employee e3 = new Employee(103,"Suraj",12000);
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			System.out.println();
			
			Employee.changename("Sinhgad");
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
		}
	

}
