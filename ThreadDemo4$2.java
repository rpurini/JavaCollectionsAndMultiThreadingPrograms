//Program::Overriding start() method and adding super.start() method in MyThread class

class MyThread extends Thread{
	
	
	public void run(){
		System.out.println("run() method");
	}
	public void start(){
		super.start();//calling Thread class start() method::new thread wil be created 
		System.out.println("start()method");
	}
	
}

//test class
class ThreadDemo4$2{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.start();
		System.out.println("main() method");
	}
}