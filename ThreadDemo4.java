//Overriding start() method

class MyThread extends Thread{
	public void run(){
		System.out.println("run()method");
	}
	public void start(){
		System.out.println("start() method");
	}
}

//Test class
class ThreadDemo4{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//new thread won't be created and call start() method of MyThread class like normal method call
        System.out.println("main() method");		
	}
}