public class Demo implements Runnable{
	synchronized{
		public void run(){
			//to display a loop
			for(int i=0;i<=10;i++){
				System.out.println("Hi");
			}
		  }
	   }
	
}
public class Demo2{
	public static void main(String [] args) throws InterruptedException{		
		Thread thred=new Thread();
		Demo demo=new Demo(thread);
		//new thread will execute
		demo.start();
		demo.wait();
		
				
		
	}
}