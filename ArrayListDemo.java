//ArrayList Demo
//ArrayList Demo
import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList aL=new ArrayList();
		//adding elements
		aL.add("raja");
		aL.add("vinodh");
		aL.add("dinee");
		aL.add(400);
		aL.add(400.5f);
		aL.add(400.50);
		aL.add("raja");
		aL.add(250L);
		aL.add(null);		
		System.out.println("The ArrayList values :"+aL);
		
		//remove method
		aL.remove(0);
		System.out.println("The ArrayList values after deleting first element:"+aL);
		
		//add element based on index
		aL.add(2,"Raja");
		System.out.println("The ArrayList values after adding element based on index:"+aL);
		aL.add("Karthik");
		System.out.println("The ArrayList values after adding element:"+aL);
		
	}
}