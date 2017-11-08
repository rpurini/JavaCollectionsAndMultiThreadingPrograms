//Class Level Lock
//Program to display first 10 numbers followed by 10 characters
//program-2: using synchronize keyword-->Class level Lock 
//If we are not use synchronize keyword, we will get irregular output
class Display{
	public synchronized void displayNumbers(){
		for(int i=1;i<=10;i++){
			System.out.print(i);
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie){
				
			}
		}
	}
	public synchronized void displayChracters(){
		for(int i=65;i<=75;i++){
			System.out.print((char)i);
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){
				
			}
		}
	}
}
//User thread class-1
class MyRunnable1 implements Runnable{
	Display d;
	MyRunnable1(Display d){
		this.d=d;
	}
	public void run(){
		d.displayNumbers();
	}
}
//User thread class-2
class MyRunnable2 implements Runnable{
	Display d;
	MyRunnable2(Display d){
		this.d=d;
	}
	public void run(){
		d.displayChracters();
	}
}

//Test class
class ThreadSyncDemo3$0{
	public static void main(String [] args){
		Display d=new Display();
		MyRunnable1 r1=new MyRunnable1(d);
		Thread t1=new Thread(r1);
		
		MyRunnable2 r2=new MyRunnable2(d);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
