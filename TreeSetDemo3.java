//What Happened when StringBuffer objects store in TreeSet

import java.util.*;
class TreeSetDemo3{
	public static void main(String [] args){
		TreeSet tS=new TreeSet();
		tS.add(new StringBuffer("Raja"));//ClassCastException because StringBuffer cant implemented Comparable(I)
		tS.add(new StringBuffer("Vinodh"));
		System.out.println("Elements from collection:"+tS);
	}
}