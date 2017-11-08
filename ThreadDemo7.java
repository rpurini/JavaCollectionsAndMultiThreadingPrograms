//***Another way to define a thread but not recommended
class MyThread extends Thread{
	public void run(){
		System.out.println("child thread-");
	}
}
class ThreadDemo7{
	public static void main(String [] args){
		MyThread t=new MyThread();
		//t.start();//norma way to start a thread
		Thread t2=new Thread(t);
		t2.start();//new thread will be created
		System.out.println("main thread-");
	}
}