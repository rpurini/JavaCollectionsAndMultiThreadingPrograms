//Comparator(I) usage and implementation
//Write a program to insert Integer objects into the TreeSet where the sorting order is descending order
//We need to implement code i.e it is customized sorting
//Comparator is present in java.util package
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2){
			return 1;
		}
		if(I1>I2){
			return -1;
		}
		else return 0;
	}
}
//Test class
class TreeSetDemo4{
	public static void main(String [] args){
		TreeSet tS=new TreeSet();//Default Narural Sorting Order:: calls compareTo() method of Objecct class
		//add Integer objects
		tS.add(250);
		tS.add(150);
		tS.add(25);
		tS.add(450);
		tS.add(325);
		tS.add(174);
		System.out.println("Elements in collection :DNSO: "+tS);
		
		//Implement Custom Sorting Order
		TreeSet ts2=new TreeSet(new MyComparator ());//Customised Sorting
		ts2.add(250);
		ts2.add(150);
		ts2.add(25);
		ts2.add(450);
		ts2.add(325);
		ts2.add(174);
		System.out.println("Elements in collection :CSO: "+ts2);
	}
}