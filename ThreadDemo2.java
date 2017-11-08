//Overloading run() method
class MyThread extends Thread{
	public void run(){
		System.out.println("0-arg run() method");
	}
	public void run(int i){
		System.out.println("run(int i) method"+i);
	}
}

//Test class
class ThreadDemo2{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created and call run() method
		//t.run(250);//call run(int i)method		
	}
}