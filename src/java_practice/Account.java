package java_practice;

import java.util.*;



public class Account {
	static int balance,wd_amnt;
	public Account(int wd_amnt) {
	
		wd_amnt=this.wd_amnt;
	 
		if(wd_amnt<=balance){
			balance=balance-wd_amnt;
			System.out.println("Withdrawl amount:"+wd_amnt);
			System.out.println("Available Balance:"+balance);
		}
		else{
			System.out.println("Debit Amount exceeded account balance");
		}
	
	 	}
	 }


class Account_test{
	public static void main(String[] args) {
		System.out.println("Enter the Balance:");
		Scanner sc=new Scanner(System.in);
		Account.balance=sc.nextInt();
		System.out.println("---------------------------");
		System.out.println("Your available balance is:"+Account.balance);
		
		System.out.println("Enter the amount to be withdrawn:");
		Account.wd_amnt=sc.nextInt();
		Account acc= new Account(Account.wd_amnt);
	}
	}	

