package duoxiancheng;

public class Apple extends Thread{
	private int apple = 50;
		@Override
		public void run() {
			for(int i =0 ;i<50;i++) {
				if(apple>0) {
					System.out.println(this.getName()+"吃的第"+apple+"个苹果");
					apple--;
				}
			}
			
		}
}
