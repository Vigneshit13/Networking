package java_practice;

public class SavingsAccount {
	static int roi1;
	private int savings_bal,intrst;
	static void roi(int roi){
		roi1=roi;
	}
	void interest(int savings_bal){
		intrst=(savings_bal*roi1)/12;
		savings_bal+=intrst;
		System.out.println("Balance : "+savings_bal);
	}
public static void main(String[] args) {
	SavingsAccount sa = new SavingsAccount();
	sa.roi(4);
	System.out.println("Saver-1 balance at the rate of 4% interest:");
	
	sa.interest(2000);
	System.out.println("Saver-2 balance at the rate of 4% interest:");
	sa.interest(3000);
	System.out.println("-------------------------------------------");

	SavingsAccount sa1=new SavingsAccount();
	sa.roi(5);
	System.out.println("Saver-1 balance at the rate of 5% interest:");
	sa1.interest(2000+sa.intrst);
	System.out.println("Saver-2 balance at the rate of 5% interest:");
	sa1.interest(3000+sa.intrst);
}
}

