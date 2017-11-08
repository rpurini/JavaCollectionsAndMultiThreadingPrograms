//TreeSetDemo
//Heterogeniuos values are not possible
//insertion order is not preserved
//null insertion not possible
import java.util.*;
class TreeSetDemo1{
	public static void main(String [] args){
		TreeSet ts=new TreeSet();
		ts.add("A");
		ts.add("a");
		ts.add("R");
		ts.add("K");
		ts.add("G");
		System.out.println("Elements from collection :"+ts);
		//ts.add(new Integer(100));//ClassCastException
		//ts.add(null);//NullPointerException
	}
}