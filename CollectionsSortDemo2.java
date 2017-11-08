//Utility classes
//1. Collections 2. Arrays
//Demo on Collections methods(sort,search, reverse operations)
//Program to demonstrate sorting elements of List according to DNSO
//By default List does not contains sorting order
import java.util.*;
class CollectionsSortDemo2{
	public static void main(String [] args){
		List <String>l=new ArrayList<String>();
		l.add("Raja");
		l.add("Kiran");
		l.add("Charan");
		l.add("Vinodh");
		l.add("Aadhi");
		l.add("Sarath");
		
		System.out.println("Elements from List collection: "+l);//insertion order preserved
		
		//default natural sorting order
		Collections.sort(l);
		System.out.println("Sorted collection(default sorting): "+l);
		
		//customized sorting
		Collections.sort(l,new MyComparator());
		System.out.println("Sorted collection(Customised sorting): "+l);
		
	}
}

//Customised sorting
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=obj1.toString();
		String s2=(String)obj2;
		return s2.compareTo(s1);//reverse of aplhabetical order
	}
}