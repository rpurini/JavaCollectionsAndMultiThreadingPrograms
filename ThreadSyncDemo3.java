//***Syncronization Concept using sinchronized keyword
//program1: using static synchronize keyword-->Class level Lock 
class Display{
	public static synchronized void wish(String name){
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
class ThreadSyncDemo3{
	public static void main(String [] args){
		Display d1=new Display();
		Display d2=new Display();
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		MyRunnable r2=new MyRunnable(d2,"Kohli");
		Thread t2=new Thread(r2);
			
		t1.start();
		t2.start();
				//regular output
	}
}