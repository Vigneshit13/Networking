package threadS;

public class Mypg1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(i);
	}
	public static void main(String[] args) {
	Mypg1 obj = new Mypg1();
	obj.start();
	for (int i = 11; i <=20; i++) {
		System.out.println(i);
	}
	
}
}
