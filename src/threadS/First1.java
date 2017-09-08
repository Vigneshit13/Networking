package threadS;

public class First1 extends Thread {

	//First1 ab = new First1();
	@Override
	public void run() {
//		synchronized (ab) {
//			System.out.println("it is in synchronized block..");
//		}
	for (int i = 0; i < 10; i++) {
		System.out.println("New thread:"+i);
	}	
	}
	
	public static void main(String[] args) {
		First1 a = new First1();
		a.start();
		
		for (int i = 10; i<20; i++) {
			System.out.println("Main Thread:"+i);
		}
	}
	

}
