//Program to display SortedSet(I) methods
//Heterogeniuos values are not possible
//insertion order is not preserved
//null insertion not possible

import java.util.*;
class TreeSetDemo2{
	public static void main(String [] args){
		TreeSet ts=new TreeSet();
		ts.add(150);		
		ts.add(410);
		ts.add(200);	
		ts.add(525);
		ts.add(275);
		ts.add(325);
		ts.add(221);
		ts.add(380);
		ts.add(175);
		ts.add(450);
		ts.add(350);
		
		System.out.println("Elements from collection :"+ts);
		
		//SortedSet methods automatically available to TreeSet
		//first element
		System.out.println("FirstElement in Set is:"+ ts.first());
		//last element
		System.out.println("Last Element in Set is:"+ ts.last());
		//head set
		SortedSet ss=ts.headSet(325);
		System.out.println("Head Set of 325:"+ss);
		//tail set
		SortedSet ss2=ts.tailSet(325);
		System.out.println("Tail Set of 325:"+ss2);
		//sub set
		SortedSet ss3=ts.subSet(275,450);
		System.out.println("The sub set of 275 and 450: "+ss3);
		
		
	}
}