package threadS;

public class MyThread {
public static void main(String[] args) {
	Runnable r1= new Runnable1();
	Thread t1=new Thread(r1);
	t1.start();
	
	Runnable r2=new Runnable2();
	Thread t2=new Thread(r2);
	t2.start();	

}

}
 class Runnable1 implements Runnable{
		 @Override
		
	public void run() {
			 try{
			 for (int i = 1; i <16; i++) {
		if(i%2!=0){
			System.out.println("Odd:"+i);
			
		}
		Thread.sleep(1000);
		
	}}catch(Exception e){
		System.out.println(e);
		
	}
	}
}
class Runnable2 implements Runnable{
	@Override
	public void run() {
		try{
		for (int i = 1; i <16; i++) {
			if(i%2==0){
				System.out.println("Even:"+i);
			}
			Thread.sleep(1000);
		}
		}catch(Exception e){
			System.out.println(e);
			}
		
	}
}