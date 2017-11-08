//TreeMapDemo
//no insertion order; elements store based on some sorting order or keys
//Program to demonstrate Default Natural Sorting Order
import java.util.*;
class TreeMapDemo1{
	public static void main(String [] args){
		TreeMap tm=new TreeMap();//DNSO
		tm.put(1025,"Raja");
		tm.put(952,"Vinodh");
		tm.put(1252,"Charan");
		tm.put(1035,"Kiran");
		tm.put(825,"Sai");
		System.out.println(tm);//display based on DNSO of keys
		//tm.put(null,"Guru");//NPE
		tm.put(625,null);//valid
		//tm.put("Joy",1000);//RE:ClassCastException
	}
}