//LinkedHashMap has insertion order

import java.util.*;
class LinkedHashMapDemo1{
	public static void main(String [] args){
	//HashMap
	HashMap hm=new HashMap();
	//adding elements
	hm.put(1025, "Raja");
	hm.put(2525,"Vinodh");
	hm.put(952,"Dinee");
	hm.put(2952,"Kiran");
	hm.put(1952,"Dinee");
	System.out.println("Elements from HashMap: "+hm);//insertion order is not preserved
	}
}