class Parent{
	
	static int x=m1();
	Parent(){
		// System.out.println("Parent() 0 arg constructor");
	}
	public static int m1(){
		System.out.println("m1 of Parent");
		return 20;
	}
	static{
		System.out.println("Static block from Parent class");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child() 0 arg constructor");
	}
	static{
		System.out.println("Static block from Child class");
	}
	public static void main(String[] args){
		System.out.println("main() from Child class");
		new Child();
	}
	
}