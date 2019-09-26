package duoxiancheng;

public class Apple1 implements Runnable{
		int apple1 = 50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(apple1>0) {
			System.out.println(Thread.currentThread().getName()	+apple1+"q苹果");
			apple1--;
		}
		}
	}
		
	}



