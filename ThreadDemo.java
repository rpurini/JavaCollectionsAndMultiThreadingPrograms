//MULTI THREADING CONCEPT PROGRAMS
//By extending Thread class
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

//Test class
class ThreadDemo{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
	}
}