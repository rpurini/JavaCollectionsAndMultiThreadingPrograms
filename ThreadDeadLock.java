//DeadLock Situation in multi threading
//using join() method:-->If main thread calls join() method on child thread and child thread calls join() method on main thread--both threads will wait forever --this is called DEADLOCK situation 

class MyRunnable implements Runnable{
	static Thread mainThread;
	public void run(){
		try{
				mainThread.join();
				//Thread.sleep(1500);
			}
			catch(InterruptedException ie){}
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			
		}
	}
}
class ThreadDeadLock{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable.mainThread=Thread.currentThread();
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			Thread.sleep(1500);
		}
	}
}