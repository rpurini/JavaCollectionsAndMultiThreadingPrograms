//***Syncronization Concept using sinchronized keyword
//program1: using synchronize keyword
class Display{
	public synchronized void wish(String name){
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		System.out.println(name);
		}
	}
} 
//User thread class
class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}


//test class
class ThreadSyncDemo1{
	public static void main(String [] args){
		Display d=new Display();
		
		MyRunnable r1=new MyRunnable(d,"Dhoni");
		Thread t1=new Thread(r1);
		
		MyRunnable r2=new MyRunnable(d,"Kohli");
		Thread t2=new Thread(r2);
		
		MyRunnable r3=new MyRunnable(d,"Rohit");
		Thread t3=new Thread(r3);
		
		MyRunnable r4=new MyRunnable(d,"Pandya");
		Thread t4=new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}