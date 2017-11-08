//**Getting and setting name of a thread
//program
class MyRunnable implements Runnable{
	public void run(){
		//System.out.println("child thread");
		System.out.println("run() method executed by :"+Thread.currentThread().getName());		
	}
}
class ThreadNamesDemo{
	public static void main(String [] args){
		//get name of current thread
		System.out.println("main() method executed by :"+Thread.currentThread().getName());
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("created thread name is : "+t.getName());
		
		//changing main thread name programmatically
		Thread.currentThread().setName("Raja-thread");
		System.out.println("main thread name is changed to : "+Thread.currentThread().getName());
		System.out.println(10/0);//Exception in thread "Raja-thread"
									//java.lang.ArithmeticException: / by zero
									//at ThreadNamesDemo.main(ThreadNamesDemo.java:21)
	}
}