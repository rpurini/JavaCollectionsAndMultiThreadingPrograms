//HashSetDemo
//insertion order is not preserved
import java.util.*;
class HashSetDemo{
	public static void main(String [] args){
		HashSet hS=new HashSet();
		hS.add("Raja");
		hS.add("Vinodh");
		hS.add(250);
		hS.add(null);
		System.out.println("Elements from collection : "+hS);//insertion order is not preserved
		//adding duplicate obj
		System.out.println("When trying to add duplicate element in HashSet:"+hS.add("Raja"));
		hS.add("Dinee");
		System.out.println("Total Elements from collection : "+hS);
	}
}