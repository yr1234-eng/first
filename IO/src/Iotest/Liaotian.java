package Iotest;

public class Liaotian extends Thread{
		@Override
		public void run() {
			for (int i =0;i<5;i++) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("这是第"+i+"次");
			}
		}
	
}

