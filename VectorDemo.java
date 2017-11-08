
import java.util.*;
class VectorDemo{
	public static void main(String [] args){
		//vector obj
		//Vector v=new Vector();//initial capacity is 10
		Vector v=new Vector(10,5);
		System.out.println("Vector class obj initial capacity::"+v.capacity());
		//adding elements through loop
		for(int i=1;i<=10;i++){
			v.addElement(i);
		}
		System.out.println("Vector class obj capacity after adding 10 elements::"+v.capacity());
		
		//adding 11th element
		v.addElement("Raja");		
		System.out.println("Vector class obj capacity after adding 11th element::"+v.capacity());
		
		//print elements from vector obj
		System.out.println("Elements from vector object : "+v);
	}
}