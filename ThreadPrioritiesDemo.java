//***Thread Priorities
//Program
class MyRunnable implements Runnable{
	public void run(){
		//System.out.println("child thread");
	}
}
class ThreadPrioritiesDemo{
	public static void main(String [] args){
		System.out.println("main thread default priority is :"+Thread.currentThread().getPriority());				
		//setting priority for main thread
		//Thread.currentThread().setPriority(15);//RE: java.lang.IllegalArgumentException
		Thread.currentThread().setPriority(8);
		System.out.println("main thread current priority is :"+Thread.currentThread().getPriority());
		//child thread creation
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		//child thread priority
		System.out.println("Child thread priority is: "+t.getPriority());
	}
}