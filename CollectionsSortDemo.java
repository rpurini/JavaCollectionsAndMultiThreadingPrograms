//Utility classes
//1. Collections 2. Arrays
//Demo on Collections methods(sort,search, reverse operations)
//Program to demonstrate sorting elements of List according to DNSO
//By default List does not contains sorting order
import java.util.*;
class CollectionsSortDemo{
	public static void main(String [] args){
		List <String>l=new ArrayList<>();
		l.add("Raja");
		l.add("Kiran");
		l.add("Charan");
		l.add("Vinodh");
		l.add("Aadhi");
		l.add("Sarath");
		
		System.out.println("Elements from List collection: "+l);//insertion order preserved
		
		//Sorting
		Collections.sort(l);//dnso
		System.out.println("Sorted collection list: "+l);//DNSO-alphabetical
	}
}