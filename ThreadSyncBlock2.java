//***Synchronization Block 
//Program to demonstrate synchronization block
class Display{
	public void wish(String name){
		;;;;;;;;;;;;;;;;//1 lakh lines of code
	  synchronized(this){//current object lock
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){}
			System.out.println(name);
		}
	  }
		;;;;;;;;;;//1 lakh lines of code
	}
}

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

class ThreadSyncBlock2{
	public static void main(String [] args){
		Display d=new Display();
		Display d1=new Display();
		MyRunnable r= new MyRunnable(d,"Kohli");
		Thread t=new Thread(r);
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		t.start();
		t1.start();
		//Irregular out put--> in this case we need use Class level lock synchronized block
	}
}