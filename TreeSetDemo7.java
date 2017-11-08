//Write a program to insert StringBuffer objects into TreeSet where sorting order is alphabetical order
import java.util.*;
class TreeSetDemo7{
	public static void main(String [] args){
		TreeSet ts=new TreeSet(new MyComparator());
		//add SB objects
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("T"));
		ts.add(new StringBuffer("M"));
		ts.add(new StringBuffer("G"));
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("B"));
		System.out.println("StringBuffer objest in TreeSet in alphabetical order(CSO) :"+ts);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		//converting SB objects into String objects
		String s1=obj1.toString();
		String s2=obj2.toString();
		//alphabetical order
		return s1.compareTo(s2);
		//reverse
		//return s2.compareTo(s1);
	}
}
