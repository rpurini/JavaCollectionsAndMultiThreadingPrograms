//LinkedHashMap has insertion order

import java.util.*;
class LinkedHashMapDemo2{
	public static void main(String [] args){
	//LinkedHashMap
	LinkedHashMap hm=new LinkedHashMap();
	//adding elements
	hm.put(1025, "Raja");
	hm.put(2525,"Vinodh");
	hm.put(952,"Dinee");
	hm.put(2952,"Kiran");
	hm.put(1952,"Dinee");
	System.out.println("Elements from HashMap: "+hm);//insertion order is preserved
	}
}