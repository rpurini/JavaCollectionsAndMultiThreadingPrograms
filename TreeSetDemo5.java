//Various possible implementations of compare() method:
//Actually TreeSet elements Insertion order not supported but programatically we can achieve
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		//1
		 //return I1.compareTo(I2);//Default natural soring order-ascending
	    //2
		//return -I1.compareTo(I2);//Discending order-reverse
		//3
		//return I2.compareTo(I1);//Discending order
		//4
		//return -I2.compareTo(I1);//Ascending order
		//5
		//return 1;//**Insertion Order
		//6
		//return -1;//**Reverse of Insertion order
		//7
		return 0;//add first element and remaining alements are treated as duplicates
	}
}
//Test class
class TreeSetDemo5{
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