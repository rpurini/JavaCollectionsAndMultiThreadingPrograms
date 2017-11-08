//if change in hashCode method
import java.util.*;
class HashtableDemo2{
	public static void main(String[] args){
		Hashtable ht=new Hashtable();
		ht.put(new Temp(5),"Raja");
		ht.put(new Temp(2),"Raja");
		ht.put(new Temp(6),"Raja");
		ht.put(new Temp(15),"Raja");
		ht.put(new Temp(23),"Raja");
		ht.put(new Temp(16),"Raja");
		System.out.println("Elements from Hashtable collection:"+ht);
		
	}
}

//user class 
class Temp{
	int hashCodeNumber;
	
	//constructor
	Temp(int hashCodeNumber){
		this.hashCodeNumber=hashCodeNumber;
	}
	//ovveride hashcode
	public int hashCode(){
		return hashCodeNumber % 9;
	}
	//override toString
	public String toString(){
		return hashCodeNumber+"";
	}
}