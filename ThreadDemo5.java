//Program to reastart a thread
class MyThread extends Thread{
	public void run(){
		System.out.println("run method");
	}
}

//test class
class ThreadDemo5{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.start();//new thread will be created
		System.out.println("main method");
		t.start();//re-starting a thread-->>>Exception in thread "main" java.lang.IllegalThreadStateException
	}
}