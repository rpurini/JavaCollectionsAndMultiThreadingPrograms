//Program to explain about internal process of WeakHashMap
//This program will demonstrate HashMap > GC

import java.util.*;
class WeakHashMapDemo1{
	public static void main(String [] args) throws Exception{
		HashMap hm=new HashMap();		
		//adding Temp class obj to collection
		Temp t=new Temp();
        hm.put(t,"Raja");
        System.out.println("Elements in collection::"+hm);
		
		//nullyfying Temp object to avail GC
		t=null;
		//call GC
		System.gc();
        Thread.sleep(5000);
        System.out.println("After calling GC, collection is :"+hm);			
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
		System.out.println("Finalize method called..//GC perform clean up activity.");
	}
}