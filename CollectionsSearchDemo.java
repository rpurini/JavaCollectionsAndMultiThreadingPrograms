//Program to demonstrate search operation in List collections

import java.util.*;
class CollectionsSearchDemo{
	public static void main(String [] args){
		ArrayList <String> l=new ArrayList<String>();
		l.add("A");
		l.add("K");
		l.add("J");
		l.add("M");
		l.add("Z");
		l.add("a");
		l.add("C");
		l.add("N");
		System.out.println("List Collection: "+l);//insertion order
		//sort
		Collections.sort(l);
	    System.out.println("Sorted List Collection: "+l);//default natural sorting order
		
		//binary search
		System.out.println(Collections.binarySearch(l,"Z"));//+ve value(index)
		System.out.println(Collections.binarySearch(l,"o"));//-ve value(return insertion point)
		
		//MyComparator object
		MyComparator mc=new MyComparator();
		//customized sorting
		Collections.sort(l,mc);
		System.out.println("Customized sorting collection: "+l);
		//binarySearch operation on customized sorting list
		System.out.println(Collections.binarySearch(l,"Z",mc));
		System.out.println(Collections.binarySearch(l,"z",mc));
		System.out.println(Collections.binarySearch(l,"O",mc));
	}
}

//customized sorting order
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}