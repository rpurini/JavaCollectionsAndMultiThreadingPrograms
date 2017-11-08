//If we are not overriding run() method
class MyThread extends Thread{
	
}

//Test class
class ThreadDemo3{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created and epmpty output because in Thread class run() method is empty
//****It is highly recommended to override run() method to assign job for thread****		
	}
}