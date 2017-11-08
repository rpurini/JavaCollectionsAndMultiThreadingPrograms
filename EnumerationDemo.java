//Enumeration Demo
//Print only even numbers From Vector obj

import java.util.*;
class EnumerationDemo{
	public static void main(String [] args){
		
		//Vector obj
		Vector v=new Vector();
		
		//adding elements through loop
		for(int i=0;i<=100;i++){
			v.addElement(i);
		}
		System.out.println("Elements in vector object: "+v);
		//Display elements one by one using Enumeration
		System.out.println("Elements one by one:\n");
		Enumeration e=v.elements();		
		while(e.hasMoreElements()){
			Integer I=(Integer)e.nextElement();
			System.out.println(+I);
		}
		
		//Displaying even numbers only one by one
		System.out.println("Even elements from vector object:\n");
		Enumeration e1=v.elements();
		while(e1.hasMoreElements()){
			Integer evenInt=(Integer)e1.nextElement();
			if(evenInt%2==0){
				System.out.println(evenInt);
			}
		}
	}
}