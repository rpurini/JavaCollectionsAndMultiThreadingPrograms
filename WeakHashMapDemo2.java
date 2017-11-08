//Program to explain about internal process of WeakHashMap
//This program will demonstrate WeakHashMap < GC || GC is powerful than WeakHashMap

import java.util.*;
class WeakHashMapDemo2{
	public static void main(String [] args) throws Exception{
		WeakHashMap whm=new WeakHashMap();		
		//adding Temp class obj to collection
		Temp t=new Temp();
        whm.put(t,"Raja");
        System.out.println("Elements in collection::"+whm);
		
		//nullyfying Temp object to avail GC
		t=null;
		//call GC
		System.gc();
        Thread.sleep(5000);
        System.out.println("After calling GC, collection is :"+whm);			
	}
}

//Temp class
class Temp{
	//toString() 
	public String toString(){
		return "temp";
	}
	
	//override finalize() method
	public void finalize(){
		System.out.println("Finalize method called..//GC performs clean up activity.");
	}
}