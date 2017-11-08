//join() method 
//Program to demonstrate --> child thread will wait until main thread execution
class MyRunnable implements Runnable{
	//static variable
	static Thread mainThread;//Thread type
	
	public void run(){
		try{
			mainThread.join();
			//mainThread.join(6500,500);
		}
		catch(InterruptedException ie){
			
		}
		
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

class ThreadJoinDemo2{
	public static void main(String [] args)throws InterruptedException{
		//assign main thread to above mentioned variable
		MyRunnable.mainThread=Thread.currentThread();
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}
}