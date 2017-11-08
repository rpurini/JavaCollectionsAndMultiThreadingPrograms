//Map(I) programs
//Program to explain Map methods
//HashMapDemo
import java.util.*;
class HashMapDemo{
	public static void main(String [] args){
		HashMap hm=new HashMap();
		//adding elements into map collection
		hm.put("Raja",1025);
		hm.put("Dinee",1352);
		hm.put("Karthik",1225);
		hm.put("Guru",2325);
		hm.put("Charan",1145);
		System.out.println("Elements from hashMap collection: "+hm);//insertion order not preseerved
		//adding duplicate values
		System.out.println(hm.put("Raja",1555));
		System.out.println(hm);//new value will replace old value as per key and return old value
		
		//To get keys as one set
		Set s=hm.keySet();
		System.out.println("All keys from Hashmap collection: "+s);
		
		//To get values as one collection
		Collection c=hm.values();
		System.out.println("Values from collection: "+c);
		
		//To get all entries as a set
		Set s1=hm.entrySet();
		System.out.println("Entrys as a set: "+s1);
		
		//Display values entries one by one using iterator concept
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());//get keys and values from Entry set
			if(m1.getKey().equals("Charan")){
				m1.setValue(5555);
			}
		}
		
		System.out.println(hm);
	}
}