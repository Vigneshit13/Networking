package java_practice;

public class Emp1 {
	 String fname,lname;
	 double sal;

	public Emp1(String fname,String lname,double sal) {
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
		System.out.println(fname+" "+lname+" "+sal);			
	}

}


class EmployeTest{
	public static void main(String[] args) {
		System.out.println("Hello...");
		System.out.println("Employee1 Details:");
		Emp1 em = new Emp1("Vignesh", "Vikki", 569856);
		System.out.println("--------------------------");
		System.out.println("Employee2 Details:");
		Emp1 em1 = new Emp1("Java", "Sun", 19981998);
	}
}
