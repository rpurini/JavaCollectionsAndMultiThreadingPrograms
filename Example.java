//static blocks examples
class Example{
	Example(){
		System.out.println("Example() 0 arg constructor");
	}
	static{
		System.out.println("static block 1");
	}
	public static int m1(){
		System.out.println("m1()method");
		return 10;
	}
	static{
		System.out.println("static block 2");
		System.out.println(m1());
	}
}

//test class
class Test{
	public static void main(String [] args){
		Example e1= new Example();
		Example e2= new Example();
		Example e3= new Example();
	}
}