package java_practice;

public class Employee {
	private String fname,lname;
	private double sal;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("First Name:"+fname);
	}
	public String getLname() {
		return lname;
		
	}
	public void setLname(String lname) {
		this.lname = lname;
		System.out.println("Last Name:"+lname);
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
		System.out.println("Salary:"+sal);
	}
	public Employee(String fname,String lname,double sal) {
		System.out.println(fname+" "+lname+" "+sal);
		
	}
}

class EmployeeTest{
	public static void main(String[] args) {
		System.out.println("Employee1 Details:");
		System.out.println("-------------------------");
		Employee em = new Employee("Vignesh","Vikki",5698);
		em.setFname("Vignesh");
		em.setLname("Vikki");
		em.setSal(1000000);
		System.out.println("First Name:"+em.getFname()+"  "+"Last Name:"+em.getLname()+"  "+"Salary:"+em.getSal());
		System.out.println("--------------------------");
		System.out.println("Employee2 Details:");
//		Employee em1 = new Employee();
		em.setFname("Raj");
		em.setLname("Maaaa");
		em.setSal(17);
		System.out.println("First Name:"+em.getFname()+"  "+"Last Name:"+em.getLname()+"  "+"Salary:"+em.getSal());
		}
}
 