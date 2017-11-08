//******DEADLOCK SITUATION-->>MAIN
//Two threads are waiting for each other forever --infinity waiting
class TestA{
	public synchronized void dead1(TestB b){
		System.out.println("main thread (t1) starts execution of dead1() method ");
		
		b.last();
	}
	public synchronized void last(){
		System.out.println("TestA class: last() method");
	}
}
class TestB{
	public synchronized void dead2(TestA a){
		System.out.println("child thread (t2) starts execution of dead2() method ");
		
		a.last();
	}
	public synchronized void last(){
		System.out.println("TestB class: last() method");
	}
	
}

class DeadLockSituation extends Thread{
	TestA a =new TestA();
	TestB b=new TestB();
	
	public void run(){
		b.dead2(a);//child thread executes this code
	}
	public void m1(){
		this.start();//child thread running
		
		a.dead1(b);//main thread executes this code
		}

	public static void main(String [] args){
		DeadLockSituation d=new DeadLockSituation();
		d.m1();
	}
}