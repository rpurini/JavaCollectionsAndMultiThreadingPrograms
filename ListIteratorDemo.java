//ListIteratorDemo
//Using ListIterator methods we can also perform remove, replace and add operations on collection obj
import java.util.*;
class ListIteratorDemo{
	public static void main(String [] args){
		LinkedList lL=new LinkedList();
		lL.add("Raja");
		lL.add("Vinodh");
		lL.add("Dinee");
		lL.add("Karthik");
		System.out.println("Elements in collections:: "+lL);
		
		//Perform remove and add operations on collections
		ListIterator lI=lL.listIterator();
		while(lI.hasNext()){
			String s=(String)lI.next();
			//display one by one
			System.out.println("Display elements one by one: "+s);
			
			//remove Raja
			if(s.equals("Raja")){
				lI.remove();
			}
			//add Lokhi if found Dinee
			if(s.equals("Dinee")){
				lI.add("Lokhi");
			}	
           //replace Karthik with Prenvi
           if(s.equals("Karthik")){
			   lI.set("Dhora");//replace option
		   }		   
		}
		//add another element
			lI.add("Prenvi");
		System.out.println("Collection after perform remove and add operations: "+lL);
	}
}