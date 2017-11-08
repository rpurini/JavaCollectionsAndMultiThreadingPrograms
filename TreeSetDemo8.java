//Program: Write a program to insert String and StringBuffer objects into TreeSet, where sorting order is increasing length order. If two objects having same length then consider their aplhabetical order.
//Storing homegenious objects in TreeSet is possible through Coustomised Sorting order
import java.util.*;
class TreeSetDemo8{
	public static void main(String [] args){
		TreeSet ts=new TreeSet(new MyComparator());
			ts.add("Raja");
			ts.add(new StringBuffer("Raaj"));
			ts.add(new StringBuffer("Vinodh"));
			ts.add("Alivelamma");
			ts.add("Prenvitakshara");
			ts.add("Sreenidhi");
			ts.add(new StringBuffer("Chandraiah"));
			ts.add(new StringBuffer("Rajasekhar"));
			ts.add("Vinodh Kumar");
			System.out.println("String and SB objects in customised sorting order: "+ts);
	
	}
}
 class MyComparator implements Comparator{
	 public int compare(Object obj1, Object obj2){
		 String s1=obj1.toString();
		 String s2=obj2.toString();
		 
		 //find length
		 int l1=s1.length();
		 int l2=s2.length();
		 if(l1<l2){
			 return 1;
		 }
		 else if(l1>l2){
			 return -1;
		 }
		 else return s1.compareTo(s2);
	 }
 }