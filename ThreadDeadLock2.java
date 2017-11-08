//DeadLock Situation in multi threading
//Program1:: If a thread calls join() method on the same thread if self. then the program will be stucked.
class ThreadDeadLock2{
	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().join();//main thread calling join() it self.//DEADLOCK
		//main thread has to wait infinite amount of time
	}
}