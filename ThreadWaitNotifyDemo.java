//Program to demonstrate wait() . notify() methods usage
class ThreadWaitNotifyDemo{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		//Thread.sleep(0,1);-->>bad approach
		synchronized(t){
        	System.out.println("main thread trying to start wait() method");//-->1
		    t.wait();
		}
		System.out.println("main thread got notification");//----------------->>>4
		System.out.println(r.count);	//------------------------------------>>>5	
	}
}

class MyRunnable implements Runnable{
	int count=0;
	public void run(){
		//logic to display count of first 100 numbers
		synchronized(this){
			System.out.println("child thread starts calculation / updtation");//-->>2
			for(int i=1;i<=100;i++){
				count=count+i;
			}
			System.out.println("child thread giving notification..");//-------->>>3
			this.notify();
		}
	}
} 