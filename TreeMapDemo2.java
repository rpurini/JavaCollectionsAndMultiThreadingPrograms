//TreeMapDemo
//no insertion order; elements store based on some sorting order or keys
//Program to demonstrate Customized Sorting Order
import java.util.*;
class TreeMapDemo2{
	public static void main(String [] args){
		TreeMap tm=new TreeMap(new MyComparator());//CSO
		tm.put(1025,"Raja");
		tm.put(952,"Vinodh");
		tm.put(1252,"Charan");
		tm.put(1035,"Kiran");
		tm.put(825,"Sai");
		System.out.println(tm);//display based on CSO 
		//tm.put(null,"Guru");//NPE
		tm.put(625,null);//valid
		tm.put(1625,null);//valid
		//tm.put("Joy",1000);//RE:ClassCastException
		System.out.println(tm);
		
	}
}
//MyComparator class
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		//Descending order of keys
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}