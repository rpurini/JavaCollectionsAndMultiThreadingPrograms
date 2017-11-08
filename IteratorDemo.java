//IteratorDemo
//program to display even numbers and remove odd numbers from collection
import java.util.*;
class IteratorDemo{
	public static void main(String [] args){
		ArrayList aL=new ArrayList();
		for(int i=0;i<=20;i++){
			aL.add(i);
		}
		System.out.println("Elements in collection::"+aL);
		//To display even numbers one by one
        System.out.println("Even numbers from collection one by one:: \n");		
		Iterator it=aL.iterator();
		while(it.hasNext()){
			Integer I=(Integer)it.next();
			if(I%2==0){
				System.out.println(I);
			}
			else it.remove();//to remove odd numbers from collection
		}
		System.out.println("Elements in collection after delete odd numbers: "+aL);
	}
}