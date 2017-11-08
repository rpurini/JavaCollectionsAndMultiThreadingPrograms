//HashSetDemo
//insertion order is preserved
import java.util.*;
class LinkedHashSetDemo{
	public static void main(String [] args){
		LinkedHashSet hS=new LinkedHashSet();
		hS.add("Raja");
		hS.add("Vinodh");
		hS.add(250);
		hS.add(null);
		System.out.println("Elements from collection : "+hS);//insertion order is preserved
		//adding duplicate obj
		System.out.println("When trying to add duplicate element in HashSet:"+hS.add("Raja"));
		hS.add("Dinee");
		System.out.println("Total Elements from collection : "+hS);
	}
}