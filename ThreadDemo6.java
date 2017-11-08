//****Defining a thread by implementing Runnable(i) interface
//Runnable interface present in java.lang package
//It contains only one method is run() method
//Prgram-implementing Runnable(I) 
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("child thread");
		}
	}
}
//test class
class ThreadDemo6{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		//t.start();-->>CTE: cannot find symbol
		//Creating Thread class object
		Thread t=new Thread(r);//Here 'r' is Target Runnable
		t.start();//New thread will be created..
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}