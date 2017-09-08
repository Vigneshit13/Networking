package java_practice;
import java.util.*;
public class Date {
	private int month,day,year;
	public Date(int month,int day,int year) {
		this.month=month;
		this.day=day;
		this.year=year;
		
	}
		
		void display(){
		System.out.println(month+"/"+day+"/"+year);
	}
		
}
class DateTest{
	public static void main(String[] args) {
		Date dt = new Date(28,12,1997);
		dt.display();
		System.out.println("Enter the date in above format:");
		Scanner sc = new Scanner(System.in);
		int mon,day,yr;
		mon=sc.nextInt();
		day=sc.nextInt();
		yr=sc.nextInt();
		Date dt1=new Date(mon,day,yr);
		//System.out.println(mon+day+yr);
		dt1.display();
	}
}
