package threadS;

public class Second extends Thread{
	@Override
	public void run() {
	for(int i=1;i<=5;i++){
		System.out.println("The value:"+i);
	}
	}
	public static void main(String[] a){
		Second s = new Second();
		s.start();
		for(int i=6;i<=10;i++){
			System.out.println("the val:"+i);
		}
	}
}
