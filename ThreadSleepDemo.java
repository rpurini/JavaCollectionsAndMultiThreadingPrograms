//sleep() method
//Program to display 10 slides one by with 3 secs delay
class ThreadSleepDemo{
	public static void main(String [] args) throws InterruptedException{
		for(int i=1;i<=10;i++){
			System.out.println("Slide--"+i);
			Thread.sleep(3000);
		}
	}
}