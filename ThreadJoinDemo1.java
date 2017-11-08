//join() method 
//Program to demonstrate main thread will wait until child thread executio completed
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Seetha thread(child thread)");
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie){}
		}
	}
}
class ThreadJoinDemo1{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		//t.join(8000);
		for(int i=0;i<10;i++){
			System.out.println("Raama thread(main thread)");
		}
	}
}