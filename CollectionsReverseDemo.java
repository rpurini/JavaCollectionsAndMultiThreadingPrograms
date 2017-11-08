//Program to print collection in reverse order using Collections class reverse(-)method
import java.util.*;
class CollectionsReverseDemo{
	public static void main(String [] args){
		ArrayList <Integer> al=new ArrayList<Integer> ();
		//adding elements
		al.add(25);
		al.add(15);
		al.add(55);
		al.add(35);
		al.add(05);
		al.add(65);
		al.add(95);
		System.out.println("List Collection: "+al);//insertion order
		//reverse list
		Collections.reverse(al);
		System.out.println("Reversed List Collection: "+al);//reverse order
		
	}
}