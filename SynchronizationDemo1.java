//***Syncronization Concept using sinchronized keyword
//program1: without synchronize keyword
class Display{
	public void wish(String name){
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");
		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		System.out.println(name);
		}
	}
} 

//test class
class SynchronizationDemo1{
	public static void main(String [] args){
		Display d=new Display();
		d.wish("Dhoni");
	}
}