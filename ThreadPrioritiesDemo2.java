//***Thread Priorities
//Program
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}
class ThreadPrioritiesDemo2{
	public static void main(String [] args){
		
		Thread.currentThread().setPriority(8);
		System.out.println("main thread current priority is :"+Thread.currentThread().getPriority());
		//child thread creation
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread..");
		}
	}
}