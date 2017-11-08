//Stack demo
import java.util.*;
class StackDemo{
	public static void main(String [] args){
		//Stack obj
		Stack s=new Stack();//default
		
		//adding elements to stack obj
		s.push("Raja");
		s.push("Vinodh");
		s.push("Dinee");
		
		System.out.println("Elements in stack obj : "+ s);
		
		//removing element
		Object o=s.pop();
		System.out.println("Removed element :"+o);
		System.out.println("Current Elements in stack obj : "+ s);
		
		//adding new eleemnts
		s.push("Dora");
		System.out.println("After adding new element in stack obj : "+ s);
		Object obj=s.peek();
		System.out.println("Newly added element is :"+obj);
		
		//removing element
		Object o2=s.pop();
		System.out.println("Removed element :"+o2);
		System.out.println("Current Elements in stack obj : "+ s);
		
		//searching an element based on element name
		System.out.println("Raja element offset value is :"+s.search("Raja"));
        System.out.println("Dinee element offset value is :"+s.search("Dinee"));
	    System.out.println("Vinodh element offset value is :"+s.search("Vinodh"));
	   System.out.println("Dora element offset value is :"+s.search("Dora"));


		
		
	}
}