//***Thread interrupt
//A thread can interrupt a sleeping thread or waiting thread using interrupt() method of Thread class
class MyRunnable implements Runnable{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("lazy child thread");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie){
			System.out.println("Awww...lazy child thread got interrupted.!");
		}
	}
}

class ThreadInterruptDemo{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}