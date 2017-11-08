//Write a program to insert String objects into the TreeSet where all elements should be inserted according to reverse of alphabetical order.
import java.util.*;
class TreeSetDemo6{
	public static void main(String [] args){
		TreeSet ts=new TreeSet();
		ts.add("Charan");
		ts.add("Prabhas");
		ts.add("Vinodh");
		ts.add("Arjun");
		ts.add("Sundeep");
		ts.add("Suundip");
		ts.add("Vikas");
		System.out.println("Elements in collection:DNSO- "+ts);
		
		TreeSet ts2=new TreeSet(new MyComparator());
		ts2.add("Charan");
		ts2.add("Prabhas");
		ts2.add("Vinodh");
		ts2.add("Arjun");
		ts2.add("Sundeep");
		ts2.add("Suundip");
		ts2.add("Vikas");
		System.out.println("Elements in collection:CSO- "+ts2);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=(String)obj1;
		String s2=obj2.toString();
		//To get descending aplhabetical order
		  return -s1.compareTo(s2);
		  //or
		//return s2.compareTo(s1);
	}
}