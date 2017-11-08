
//Class Loader example
import java.lang.reflect.*;
class Student{
	public String getName(){
		return null;
	}
	public int getMarks(){
		return 250;
	}
	public String getCity(){
		return null;
	}
}
class JVMExample{
	public static void main(String[] args) throws ClassNotFoundException{
		Student s1=new Student();
		Class c1=s1.getClass();
		Student s2=new Student();
		Class c2=s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);//true
		//Note: For every loaded type only one class object will be created eventhough we are using the class multiple times in our program
	}
}