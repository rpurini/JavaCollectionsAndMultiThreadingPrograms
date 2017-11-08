//NavigableSet Demo: TreeSet is implementation class of NavigableSet(I)

import java.util.*;
class NavigableSetDemo{
	public static  void main(String[] args){
		TreeSet <Integer>ts=new TreeSet<>();
		//adding elements to set obj
		ts.add(1500);
		ts.add(2500);
		ts.add(2800);
		ts.add(3200);
		ts.add(3900);
		ts.add(4100);
		ts.add(4500);
		ts.add(4800);
		ts.add(5000);
		System.out.println("Elements from TreeSet collection : "+ts);
		//methods
		System.out.println("Lower elements of >=3200: "+ts.ceiling(3200));//3200
		System.out.println("Lower elements of > 3200: "+ts.higher(3200));//3900
		
		System.out.println("Higher element of <=4500: "+ts.floor(4500));
		System.out.println("Higher element of <4500: "+ts.lower(4500));
		
		System.out.println("Remove First value: "+ts.pollFirst());
		System.out.println("Elements from current collection : "+ts);
		
		System.out.println("Remove Last elements from current collection : "+ts.pollLast());
		System.out.println("Elements from TreeSet collection : "+ts);
		
		System.out.println("Descending set of current set: "+ts.descendingSet());
		
		
	}
}