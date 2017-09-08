package exceptionHandling;

import java.util.Scanner;

//First
public class A {
	public static void main(String[] args) {
		System.out.println("Here is First example of Exception....");
		try{
			int a,b;
			System.out.println("Enter the number:");
			Scanner sc=new Scanner(System.in);
			b=sc.nextInt();
			System.out.println("Enter the A value:");
			a=sc.nextInt();
			int c=b/a;
			System.out.println(c);
		}catch(Exception e){
			System.out.println("EXCEPTION");
		}
	}
}
