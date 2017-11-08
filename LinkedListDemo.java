//LinkedList Demo
import java.util.*;
class LinkedListDemo{
	public static void main(String [] args){
		LinkedList lL=new LinkedList();
		
		//add elements to LinkedList obj
		lL.add("Raja");
		lL.add(250);
		lL.add(null);
		lL.add("Raja");
		System.out.println("List obj values:" +lL);
		
		//replace first element using set() method
		lL.set(0,"Vinodh");
		System.out.println("List obj values:" +lL);
		
		//add element based on index
		lL.add(2,"Dinee");
	    System.out.println("List obj values:" +lL);
		
		//remove last element
		lL.removeLast();
		System.out.println("List obj values:" +lL);
		
		//remove first element
		lL.removeFirst();
		System.out.println("List obj values:" +lL);

	}
}