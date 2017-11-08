//***Thread interrupt
//2nd program
//A thread can interrupt a sleeping thread or waiting thread using interrupt() method of Thread class
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<20000;i++){
			System.out.println("child thread "+i);
		}
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ie){
			System.out.println("Awwww...child thread got interrupted.");
		}
	}
}
class ThreadInterruptDemo2{
	public static void main(String []args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}