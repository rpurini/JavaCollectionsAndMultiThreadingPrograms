//JVM Programs
//Class Loader examples

//To find out methods list and no of methods
import java.lang.reflect.*;
class Student{
	public String getName(){
		return null;
	}
	public int getMarks(){
		return 250;
	}
	public String getCity(){
		return null;
	}
}
class JVMExample{
	public static void main(String[] args) throws ClassNotFoundException{
		int count=0;
		Class c=Class.forName("java.lang.String");
		Method m[]=c.getDeclaredMethods();
		for(Method m1:m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The No of methods::"+count);
	}
}

//Class Loader example
import java.lang.reflect.*;
class Student{
	public String getName(){
		return null;
	}
	public int getMarks(){
		return 250;
	}
	public String getCity(){
		return null;
	}
}
class JVMExample{
	public static void main(String[] args) throws ClassNotFoundException{
		Student s1=new Student();
		Class c1=s1.getClass();
		Student s2=new Student();
		Class c2=s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);//true
		//Note: For every loaded type only one class object will be created eventhough we are using the class multiple times in our program
	}
}

//Collections Programs 

//ArrayList Demo
//ArrayList Demo
import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList aL=new ArrayList();
		//adding elements
		aL.add("raja");
		aL.add("vinodh");
		aL.add("dinee");
		aL.add(400);
		aL.add(400.5f);
		aL.add(400.50);
		aL.add("raja");
		aL.add(250L);
		aL.add(null);		
		System.out.println("The ArrayList values :"+aL);
		
		//remove method
		aL.remove(0);
		System.out.println("The ArrayList values after deleting first element:"+aL);
		
		//add element based on index
		aL.add(2,"Raja");
		System.out.println("The ArrayList values after adding element based on index:"+aL);
		aL.add("Karthik");
		System.out.println("The ArrayList values after adding element:"+aL);
	}
}

//LinkedList Demo
import java.util.*;
class LinkedListDemo{
	public static void main(String [] args){
		LinkedList lL=new LinkedList();
		
		//add elements to LinkedList obj
		lL.add("Raja");
		lL.add(250);
		lL.add(null);
		lL.add("Raja");
		System.out.println("List obj values:" +lL);
		
		//replace first element using set() method
		lL.set(0,"Vinodh");
		System.out.println("List obj values:" +lL);
		
		//add element based on index
		lL.add(2,"Dinee");
	    System.out.println("List obj values:" +lL);
		
		//remove last element
		lL.removeLast();
		System.out.println("List obj values:" +lL);
		
		//remove first element
		lL.removeFirst();
		System.out.println("List obj values:" +lL);

	}
}


//to know vector class obj capacity
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

//ListIteratorDemo
//Using ListIterator methods we can also perform remove, replace and add operations on collection obj
import java.util.*;
class ListIteratorDemo{
	public static void main(String [] args){
		LinkedList lL=new LinkedList();
		lL.add("Raja");
		lL.add("Vinodh");
		lL.add("Dinee");
		lL.add("Karthik");
		System.out.println("Elements in collections:: "+lL);
		
		//Perform remove and add operations on collections
		ListIterator lI=lL.listIterator();
		while(lI.hasNext()){
			String s=(String)lI.next();
			//display one by one
			System.out.println("Display elements one by one: "+s);
			
			//remove Raja
			if(s.equals("Raja")){
				lI.remove();
			}
			//add Lokhi if found Dinee
			if(s.equals("Dinee")){
				lI.add("Lokhi");
			}	
           //replace Karthik with Prenvi
           if(s.equals("Karthik")){
			   lI.set("Dhora");//replace option
		   }		   
		}
		//add another element
			lI.add("Prenvi");
		System.out.println("Collection after perform remove and add operations: "+lL);
	}
}

//HashSetDemo
//insertion order is not preserved
import java.util.*;
class HashSetDemo{
	public static void main(String [] args){
		HashSet hS=new HashSet();
		hS.add("Raja");
		hS.add("Vinodh");
		hS.add(250);
		hS.add(null);
		System.out.println("Elements from collection : "+hS);//insertion order is not preserved
		//adding duplicate obj
		System.out.println("When trying to add duplicate element in HashSet:"+hS.add("Raja"));
		hS.add("Dinee");
		System.out.println("Total Elements from collection : "+hS);
	}
}

//HashSetDemo
//insertion order is preserved
import java.util.*;
class LinkedHashSetDemo{
	public static void main(String [] args){
		LinkedHashSet hS=new LinkedHashSet();
		hS.add("Raja");
		hS.add("Vinodh");
		hS.add(250);
		hS.add(null);
		System.out.println("Elements from collection : "+hS);//insertion order is preserved
		//adding duplicate obj
		System.out.println("When trying to add duplicate element in HashSet:"+hS.add("Raja"));
		hS.add("Dinee");
		System.out.println("Total Elements from collection : "+hS);
	}
}

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

//Comparable Demo
//to check compareTo() method
//Comparable(I) from java.lang package
class ComparableDemo{
	public static void main(String [] args){
		System.out.println("A".compareTo("B"));//-ve
		System.out.println("B".compareTo("A"));//+ve
		System.out.println("A".compareTo("A"));//0
		System.out.println("Raja".compareTo("Raaj"));//+ve
		System.out.println("Raaj".compareTo("Raj"));//-ve
	}
}

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

//Write a program to insert String objects into the TreeSet where all elements should be inserted according to reverse of alphabetical order.
import java.util.*;
class TreeSetDemo6{
	public static void main(String [] args){
		TreeSet ts=new TreeSet();
		ts.add("Charan");
		ts.add("Prabhas");
		ts.add("Vinodh");
		ts.add("Arjun");
		ts.add("Sundeep");
		ts.add("Suundip");
		ts.add("Vikas");
		System.out.println("Elements in collection:DNSO- "+ts);
		
		TreeSet ts2=new TreeSet(new MyComparator());
		ts2.add("Charan");
		ts2.add("Prabhas");
		ts2.add("Vinodh");
		ts2.add("Arjun");
		ts2.add("Sundeep");
		ts2.add("Suundip");
		ts2.add("Vikas");
		System.out.println("Elements in collection:CSO- "+ts2);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=(String)obj1;
		String s2=obj2.toString();
		//To get descending aplhabetical order
		  return -s1.compareTo(s2);
		  //or
		//return s2.compareTo(s1);
	}
}

//Write a program to insert StringBuffer objects into TreeSet where sorting order is alphabetical order
import java.util.*;
class TreeSetDemo7{
	public static void main(String [] args){
		TreeSet ts=new TreeSet(new MyComparator());
		//add SB objects
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("T"));
		ts.add(new StringBuffer("M"));
		ts.add(new StringBuffer("G"));
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("B"));
		System.out.println("StringBuffer objest in TreeSet in alphabetical order(CSO) :"+ts);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		//converting SB objects into String objects
		String s1=obj1.toString();
		String s2=obj2.toString();
		//alphabetical order
		return s1.compareTo(s2);
		//reverse
		//return s2.compareTo(s1);
	}
}

//Program: Write a program to insert String and StringBuffer objects into TreeSet, where sorting order is increasing length order. If two objects having same length then consider their aplhabetical order.
//Storing homegenious objects in TreeSet is possible through Coustomised Sorting order
import java.util.*;
class TreeSetDemo8{
	public static void main(String [] args){
		TreeSet ts=new TreeSet(new MyComparator());
			ts.add("Raja");
			ts.add(new StringBuffer("Raaj"));
			ts.add(new StringBuffer("Vinodh"));
			ts.add("Alivelamma");
			ts.add("Prenvitakshara");
			ts.add("Sreenidhi");
			ts.add(new StringBuffer("Chandraiah"));
			ts.add(new StringBuffer("Rajasekhar"));
			ts.add("Vinodh Kumar");
			System.out.println("String and SB objects in customised sorting order: "+ts);
	
	}
}
 class MyComparator implements Comparator{
	 public int compare(Object obj1, Object obj2){
		 String s1=obj1.toString();
		 String s2=obj2.toString();
		 
		 //find length
		 int l1=s1.length();
		 int l2=s2.length();
		 if(l1<l2){
			 return 1;
		 }
		 else if(l1>l2){
			 return -1;
		 }
		 else return s1.compareTo(s2);
	 }
 }
 
 //Program to explain User defined Comparable and Comarator
//Employee class to activate Default natural sorting order
//Default natural sorting order for Employee is sort based on eId

import java.util.*;
class Employee implements Comparable{
	String empName;
	int eId;
	//arg-constructor
	Employee(String empName, int eId){
		this.empName=empName;
		this.eId=eId;
	}
	//toString method to display understandable output
	public String toString(){
		return empName+"--"+eId;
	}
	public int compareTo(Object obj){
		int id1=this.eId;
		Employee e=(Employee)obj;
		int id2=e.eId;
		if(id1<id2){
			return -1;
		}
		if(id1>id2){
			return 1;
		}
		else return 0;//duplicates
	}
}

//Test class: use Employee
class TreeSetDemo9{
	public static void main(String [] args){
		
		//Employee details
		Employee e1=new Employee("Raja",1025);
		Employee e2=new Employee("Vinodh",1035);
		Employee e3=new Employee("Chandraiah",1135);
		Employee e4=new Employee("Sreenidhi",1065);
		Employee e5=new Employee("Alivelamma",1013);
		Employee e6=new Employee("Karthik",1352);
		Employee e7=new Employee("Karthik",1352);
		
		//Adding Employee objects to collection
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		//Display collection
		System.out.println("Employee collection based on DNSO: " +ts);

        //If client not satisfied with DNSO, we can implement Customized sorting order	
        TreeSet ts1=new TreeSet(new MyComparator());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		//Display collection
		System.out.println("Employee collection based on CSO: " +ts1);		
	}
}

//Customized sorting order to display employee details based on Alphabetical order
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		String s1=e1.empName;
		String s2=e2.empName;
		
		return s1.compareTo(s2);
	}
}

//Map(I) programs
//Program to explain Map methods
//HashMapDemo
import java.util.*;
class HashMapDemo{
	public static void main(String [] args){
		HashMap hm=new HashMap();
		//adding elements into map collection
		hm.put("Raja",1025);
		hm.put("Dinee",1352);
		hm.put("Karthik",1225);
		hm.put("Guru",2325);
		hm.put("Charan",1145);
		System.out.println("Elements from hashMap collection: "+hm);//insertion order not preseerved
		//adding duplicate values
		System.out.println(hm.put("Raja",1555));
		System.out.println(hm);//new value will replace old value as per key and return old value
		
		//To get keys as one set
		Set s=hm.keySet();
		System.out.println("All keys from Hashmap collection: "+s);
		
		//To get values as one collection
		Collection c=hm.values();
		System.out.println("Values from collection: "+c);
		
		//To get all entries as a set
		Set s1=hm.entrySet();
		System.out.println("Entrys as a set: "+s1);
		
		//Display values entries one by one using iterator concept
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());//get keys and values from Entry set
			if(m1.getKey().equals("Charan")){
				m1.setValue(5555);
			}
		}
		
		System.out.println(hm);
	}
}

//LinkedHashMap has insertion order

import java.util.*;
class LinkedHashMapDemo1{
	public static void main(String [] args){
	//HashMap
	HashMap hm=new HashMap();
	//adding elements
	hm.put(1025, "Raja");
	hm.put(2525,"Vinodh");
	hm.put(952,"Dinee");
	hm.put(2952,"Kiran");
	hm.put(1952,"Dinee");
	System.out.println("Elements from HashMap: "+hm);//insertion order is not preserved
	}
}

//Program to explain about internal process of WeakHashMap
//This program will demonstrate HashMap > GC
import java.util.*;
class WeakHashMapDemo1{
	public static void main(String [] args) throws Exception{
		HashMap hm=new HashMap();		
		//adding Temp class obj to collection
		Temp t=new Temp();
        hm.put(t,"Raja");
        System.out.println("Elements in collection::"+hm);
		
		//nullyfying Temp object to avail GC
		t=null;
		//call GC
		System.gc();
        Thread.sleep(5000);
        System.out.println("After calling GC, collection is :"+hm);			
	}
}

//Temp class
class Temp{
	//toString() 
	public String toString(){
		return "temp";
	}
	
	//override finalize() method
	public void finalize(){
		System.out.println("Finalize method called..//GC perform clean up activity.");
	}
}

//Program to explain about internal process of WeakHashMap
//This program will demonstrate WeakHashMap < GC || GC is powerful than WeakHashMap
//WeakHashMapDemo2
import java.util.*;
class WeakHashMapDemo2{
	public static void main(String [] args) throws Exception{
		WeakHashMap whm=new WeakHashMap();		
		//adding Temp class obj to collection
		Temp t=new Temp();
        whm.put(t,"Raja");
        System.out.println("Elements in collection::"+whm);
		
		//nullyfying Temp object to avail GC
		t=null;
		//call GC
		System.gc();
        Thread.sleep(5000);
        System.out.println("After calling GC, collection is :"+whm);			
	}
}

//Temp class
class Temp{
	//toString() 
	public String toString(){
		return "temp";
	}
	
	//override finalize() method
	public void finalize(){
		System.out.println("Finalize method called..//GC performs clean up activity.");
	}
}


//TreeMapDemo
//no insertion order; elements store based on some sorting order or keys
//Program to demonstrate Customized Sorting Order
import java.util.*;
class TreeMapDemo2{
	public static void main(String [] args){
		TreeMap tm=new TreeMap(new MyComparator());//CSO
		tm.put(1025,"Raja");
		tm.put(952,"Vinodh");
		tm.put(1252,"Charan");
		tm.put(1035,"Kiran");
		tm.put(825,"Sai");
		System.out.println(tm);//display based on CSO 
		//tm.put(null,"Guru");//NPE
		tm.put(625,null);//valid
		tm.put(1625,null);//valid
		//tm.put("Joy",1000);//RE:ClassCastException
		System.out.println(tm);
		
	}
}
//MyComparator class
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		//Descending order of keys
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}

//Program to demonstrate Hashtable sorting
//We can estimate the order of alloting hashCode to keys
//We can set hashCode for keys programatically
import java.util.*;
class HashtableDemo{
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
		return hashCodeNumber;
	}
	//override toString
	public String toString(){
		return hashCodeNumber+"";
	}
}

//if change formula in hashCode method
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

//if we configure initial capacity as 25 of Hashtable
import java.util.*;
class HashtableDemo3{
	public static void main(String[] args){
		Hashtable ht=new Hashtable(25);
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
		return hashCodeNumber;
	}
	//override toString
	public String toString(){
		return hashCodeNumber+"";
	}
}

//Demo program to read and store values from properties file
import java.util.*;
import java.io.*;

class PropertiesDemo{
	public static void main(String [] args) throws Exception{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("database.properties");		
		//load properties file
		p.load(fis);
		//printing properties file
		System.out.println("Elements from properties file: "+p);
		//get specific property
		String s=p.getProperty("userName");
		System.out.println("User name is: "+s);
		
		//set property we can update values
		p.setProperty("author","rpurini");
		System.out.println("After modifications: "+p);
		
		//Writing data into property file
		FileOutputStream fos=new FileOutputStream("database.properties");
		//storing data
		p.store(fos,"Updated by: "+p.getProperty("author"));//update data with comments and time stamp
		System.out.println("After modifications2: "+p);
		
		
	}
}

//PriorityQueueDemo
import java.util.*;
class PriorityQueueDemo{
	public static void main(String [] args){
		PriorityQueue queue=new PriorityQueue();//empty queue object
		System.out.println("Elelements from queue :"+queue);
		//return first element
		System.out.println("First element of queue is: "+queue.peek());//null
		//System.out.println("First element of queue is: "+queue.element());//RE: NoSuchElementException
		
		//remove first element
		System.out.println("Removed element is : "+queue.poll());//returns null
		 //System.out.println("Removed element is : "+queue.remove());//RE: NoSuchElementException
		
		//adding elements into queue
		for (int i=0; i<=10;i++){
			queue.offer(i);
		}
		System.out.println("Elelements from queue: "+queue);
		
		//getting and removing elements from queue
		System.out.println("Removed element(First Element) : "+queue.remove());//or poll()method
		System.out.println("Elelements from current queue: "+queue);
		System.out.println("Getting first element from queue:"+queue.element());//or peek();
		System.out.println("Elelements from current queue: "+queue);
		//Elelements are printed as per expected because, Some platforms(OS) won't provide proper support for thread priorities and PriorityQueue
	}
}

//Customized PriorityQueue

import java.util.*;
class PriorityQueueDemo2{
	public static void main(String [] args){
		PriorityQueue queue=new PriorityQueue(100000,new MyComparator());//CSO
		queue.offer(90003);
		queue.offer(94928);
		queue.offer(85335);
		queue.offer(94933);
		queue.offer(91779);
		queue.offer(79545);
		System.out.println("Elements from queue :"+ queue);
			
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}

//NavigableSet Demo: TreeSet is implementation class of NavigableSet(I)

import java.util.*;
class NavigableSetDemo{
	public static  void main(String[] args){
		TreeSet <Integer>ts=new TreeSet<>();
		//adding elements to set obj
		ts.add(1500);
		ts.add(2500);
		ts.add(2800);
		ts.add(3200);
		ts.add(3900);
		ts.add(4100);
		ts.add(4500);
		ts.add(4800);
		ts.add(5000);
		System.out.println("Elements from TreeSet collection : "+ts);
		//methods
		System.out.println("Lower elements of >=3200: "+ts.ceiling(3200));//3200
		System.out.println("Lower elements of > 3200: "+ts.higher(3200));//3900
		
		System.out.println("Higher element of <=4500: "+ts.floor(4500));
		System.out.println("Higher element of <4500: "+ts.lower(4500));
		
		System.out.println("Remove First value: "+ts.pollFirst());
		System.out.println("Elements from current collection : "+ts);
		
		System.out.println("Remove Last elements from current collection : "+ts.pollLast());
		System.out.println("Elements from TreeSet collection : "+ts);
		
		System.out.println("Descending set of current set: "+ts.descendingSet());
		
		
	}
}

//NavigableMap Demo program to explain methods
//TreeMap is implemented class NavigableMap
import java.util.*;
class NavigableMapDemo{
	public static void main(String[] args){
		TreeMap tm=new TreeMap();
		//adding elements
		tm.put("b","Bat");
		tm.put("c","Cat");
		tm.put("a","Ant");
        tm.put("f","Fox");		
		tm.put("g","Gun");
		tm.put("i","Ice");
        tm.put("m","Monkey");
        tm.put("l","Love");
        tm.put("o","Ozone");		
		tm.put("z","Zeebra");
		System.out.println("Elements from Map collection: "+tm);
		
		System.out.println(tm.ceilingKey("f"));
		System.out.println(tm.higherKey("f"));
		
		System.out.println(tm.floorKey("f"));
		System.out.println(tm.lowerKey("f"));
		
		System.out.println(tm.pollFirstEntry());
		System.out.println("Elements from current collection: "+tm);
		System.out.println(tm.pollLastEntry());
		System.out.println("Elements from current collection: "+tm);
		
		System.out.println("Reverse current collection: "+tm.descendingMap());
		
	}
}

//Utility classes
//1. Collections 2. Arrays
//Demo on Collections methods(sort,search, reverse operations)
//Program to demonstrate sorting elements of List according to DNSO
//By default List does not contains sorting order
import java.util.*;
class CollectionsSortDemo{
	public static void main(String [] args){
		List <String>l=new ArrayList<>();
		l.add("Raja");
		l.add("Kiran");
		l.add("Charan");
		l.add("Vinodh");
		l.add("Aadhi");
		l.add("Sarath");
		
		System.out.println("Elements from List collection: "+l);//insertion order preserved
		
		//Sorting
		Collections.sort(l);//dnso
		System.out.println("Sorted collection list: "+l);//DNSO-alphabetical
	}
}

//Utility classes
//1. Collections 2. Arrays
//Demo on Collections methods(sort,search, reverse operations)
//Program to demonstrate sorting elements of List according to DNSO
//By default List does not contains sorting order
import java.util.*;
class CollectionsSortDemo2{
	public static void main(String [] args){
		List <String>l=new ArrayList<String>();
		l.add("Raja");
		l.add("Kiran");
		l.add("Charan");
		l.add("Vinodh");
		l.add("Aadhi");
		l.add("Sarath");
		
		System.out.println("Elements from List collection: "+l);//insertion order preserved
		
		//default natural sorting order
		Collections.sort(l);
		System.out.println("Sorted collection(default sorting): "+l);
		
		//customized sorting
		Collections.sort(l,new MyComparator());
		System.out.println("Sorted collection(Customised sorting): "+l);
		
	}
}

//Customised sorting
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=obj1.toString();
		String s2=(String)obj2;
		return s2.compareTo(s1);//reverse of aplhabetical order
	}
}


//Program to demonstrate search operation in List collections

import java.util.*;
class CollectionsSearchDemo{
	public static void main(String [] args){
		ArrayList <String> l=new ArrayList<String>();
		l.add("A");
		l.add("K");
		l.add("J");
		l.add("M");
		l.add("Z");
		l.add("a");
		l.add("C");
		l.add("N");
		System.out.println("List Collection: "+l);//insertion order
		//sort
		Collections.sort(l);
	    System.out.println("Sorted List Collection: "+l);//default natural sorting order
		
		//binary search
		System.out.println(Collections.binarySearch(l,"Z"));//+ve value(index)
		System.out.println(Collections.binarySearch(l,"o"));//-ve value(return insertion point)
		
		//MyComparator object
		MyComparator mc=new MyComparator();
		//customized sorting
		Collections.sort(l,mc);
		System.out.println("Customized sorting collection: "+l);
		//binarySearch operation on customized sorting list
		System.out.println(Collections.binarySearch(l,"Z",mc));
		System.out.println(Collections.binarySearch(l,"z",mc));
		System.out.println(Collections.binarySearch(l,"O",mc));
	}
}

//customized sorting order
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}

//MULTI THREADING CONCEPT PROGRAMS
//By extending Thread class
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

//Test class
class ThreadDemo{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
	}
}

//Program commenting t.start() and call t.run()
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

//Test class
class ThreadDemo1{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		//t.start();//thread created
		t.run();//new thread won't be created 
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
	}
}

//Overloading run() method
class MyThread extends Thread{
	public void run(){
		System.out.println("0-arg run() method");
	}
	public void run(int i){
		System.out.println("run(int i) method"+i);
	}
}

//Test class
class ThreadDemo2{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created and call run() method
		//t.run(250);//call run(int i)method		
	}
}

//Program If we are not overriding run() method
class MyThread extends Thread{
	
}

//Test class
class ThreadDemo3{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//thread created and epmpty output because in Thread class run() method is empty
//****It is highly recommended to override run() method to assign job for thread****		
	}
}

//program-Overriding start() method

class MyThread extends Thread{
	public void run(){
		System.out.println("run()method");
	}
	public void start(){
		System.out.println("start() method");
	}
}

//Test class
class ThreadDemo4{
	public static void main(String [] args){
		//Creatign User thread
		MyThread t=new MyThread();
		t.start();//new thread won't be created and call start() method of MyThread class like normal method call
		//***not recommended this approach
        System.out.println("main() method");		
	}
}

//Program::Overriding start() method and adding super.start() method in MyThread class

class MyThread extends Thread{	
	public void run(){
		System.out.println("run() method");
	}
	public void start(){
		super.start();//calling Thread class start() method::new thread wil be created 
		System.out.println("start()method");
	}
	
}

//test class
class ThreadDemo4$2{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.start();
		System.out.println("main() method");
	}
}

//Program to reastart a thread
class MyThread extends Thread{
	public void run(){
		System.out.println("run method");
	}
}

//test class
class ThreadDemo5{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.start();//new thread will be created
		System.out.println("main method");
		t.start();//re-starting a thread-->>>Exception in thread "main" java.lang.IllegalThreadStateException
	}
}

//****Defining a thread by implementing Runnable(i) interface
//Runnable interface present in java.lang package
//It contains only one method is run() method
//Prgram-implementing Runnable(I) 
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("child thread");
		}
	}
}
//test class
class ThreadDemo6{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		//t.start();-->>CTE: cannot find symbol
		//Creating Thread class object
		Thread t=new Thread(r);//Here 'r' is Target Runnable
		t.start();//New thread will be created..
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}

//***Another way to define a thread but not recommended
class MyThread extends Thread{
	public void run(){
		System.out.println("child thread-");
	}
}
class ThreadDemo7{
	public static void main(String [] args){
		MyThread t=new MyThread();
		//t.start();//norma way to start a thread
		Thread t2=new Thread(t);
		t2.start();//new thread will be created
		System.out.println("main thread-");
	}
}

//**Getting and setting name of a thread
//program
class MyRunnable implements Runnable{
	public void run(){
		//System.out.println("child thread");
		System.out.println("run() method executed by :"+Thread.currentThread().getName());		
	}
}
class ThreadNamesDemo{
	public static void main(String [] args){
		//get name of current thread
		System.out.println("main() method executed by :"+Thread.currentThread().getName());
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("created thread name is : "+t.getName());
		
		//changing main thread name programmatically
		Thread.currentThread().setName("Raja-thread");
		System.out.println("main thread name is changed to : "+Thread.currentThread().getName());
		System.out.println(10/0);//Exception in thread "Raja-thread"
									//java.lang.ArithmeticException: / by zero
									//at ThreadNamesDemo.main(ThreadNamesDemo.java:21)
	}
}

//***Thread Priorities
//Program1
class MyRunnable implements Runnable{
	public void run(){
		//System.out.println("child thread");
	}
}
class ThreadPrioritiesDemo{
	public static void main(String [] args){
		System.out.println("main thread default priority is :"+Thread.currentThread().getPriority());				
		//setting priority for main thread
		//Thread.currentThread().setPriority(15);//RE: java.lang.IllegalArgumentException
		Thread.currentThread().setPriority(8);
		System.out.println("main thread current priority is :"+Thread.currentThread().getPriority());
		//child thread creation
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		//child thread priority
		System.out.println("Child thread priority is: "+t.getPriority());
	}
}

//***Thread Priorities
//Program
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}
class ThreadPrioritiesDemo2{
	public static void main(String [] args){
		
		Thread.currentThread().setPriority(8);
		System.out.println("main thread current priority is :"+Thread.currentThread().getPriority());
		//child thread creation
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread..");
		}
	}
}

//***Preventing thread from execution
//yeild()method 
//program
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
class ThreadYieldDemo{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}

//join() method 
//Program to demonstrate main thread will wait until child thread executio completed
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Seetha thread(child thread)");
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie){}
		}
	}
}
class ThreadJoinDemo1{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		//t.join(8000);
		for(int i=0;i<10;i++){
			System.out.println("Raama thread(main thread)");
		}
	}
}

//join() method 
//Program to demonstrate --> child thread will wait until main thread execution
class MyRunnable implements Runnable{
	//static variable
	static Thread mainThread;//Thread type
	
	public void run(){
		try{
			mainThread.join();
			//mainThread.join(6500,500);
		}
		catch(InterruptedException ie){
			
		}
		
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

class ThreadJoinDemo2{
	public static void main(String [] args)throws InterruptedException{
		//assign main thread to above mentioned variable
		MyRunnable.mainThread=Thread.currentThread();
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}
}
//DeadLock Situation in multi threading
//using join() method:-->If main thread calls join() method on child thread and child thread calls join() method on main thread--both threads will wait forever --this is called DEADLOCK situation 

class MyRunnable implements Runnable{
	static Thread mainThread;
	public void run(){
		try{
				mainThread.join();
				//Thread.sleep(1500);
			}
			catch(InterruptedException ie){}
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			
		}
	}
}
class ThreadDeadLock{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable.mainThread=Thread.currentThread();
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			Thread.sleep(1500);
		}
	}
}

//DeadLock Situation in multi threading
//Program1:2: If a thread calls join() method on the same thread if self. then the program will be stucked.
class ThreadDeadLock2{
	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().join();//main thread calling join() it self.//DEADLOCK
		//main thread has to wait infinite amount of time
	}
}

//sleep() method
//Program to display 10 slides one by with 3 secs delay
class ThreadSleepDemo{
	public static void main(String [] args) throws InterruptedException{
		for(int i=1;i<=10;i++){
			System.out.println("Slide--"+i);
			Thread.sleep(3000);
		}
	}
}

//***Thread interrupt
//A thread can interrupt a sleeping thread or waiting thread using interrupt() method of Thread class
class MyRunnable implements Runnable{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("lazy child thread");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie){
			System.out.println("Awww...lazy child thread got interrupted.!");
		}
	}
}

class ThreadInterruptDemo{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}

//***Thread interrupt
//2nd program
//A thread can interrupt a sleeping thread or waiting thread using interrupt() method of Thread class
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<20000;i++){
			System.out.println("child thread "+i);
		}
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ie){
			System.out.println("Awwww...child thread got interrupted.");
		}
	}
}
class ThreadInterruptDemo2{
	public static void main(String []args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}

//***Syncronization Concept using sinchronized keyword
//program1: using synchronize keyword
class Display{
	public synchronized void wish(String name){//---->>> Object level Lock
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		System.out.println(name);
		}
	}
} 
//User thread class
class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}


//test class
class ThreadSyncDemo1{
	public static void main(String [] args){
		Display d=new Display();
		
		MyRunnable r1=new MyRunnable(d,"Dhoni");
		Thread t1=new Thread(r1);
		
		MyRunnable r2=new MyRunnable(d,"Kohli");
		Thread t2=new Thread(r2);
		
		MyRunnable r3=new MyRunnable(d,"Rohit");
		Thread t3=new Thread(r3);
		
		MyRunnable r4=new MyRunnable(d,"Pandya");
		Thread t4=new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
//***Syncronization Concept using sinchronized keyword
//program1: using synchronize keyword
class Display{
	public synchronized void wish(String name){
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		System.out.println(name);
		}
	}
} 
//User thread class
class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}


//test class
class ThreadSyncDemo2{
	public static void main(String [] args){
		Display d1=new Display();
		Display d2=new Display();
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		MyRunnable r2=new MyRunnable(d2,"Kohli");
		Thread t2=new Thread(r2);
			
		t1.start();
		t2.start();
				//irregular output
	}
}

//***Syncronization Concept using sinchronized keyword
//program1: using static synchronize keyword-->Class level Lock 
class Display{
	public static synchronized void wish(String name){
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		System.out.println(name);
		}
	}
} 
//User thread class
class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

//test class
class ThreadSyncDemo3{
	public static void main(String [] args){
		Display d1=new Display();
		Display d2=new Display();
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		MyRunnable r2=new MyRunnable(d2,"Kohli");
		Thread t2=new Thread(r2);
			
		t1.start();
		t2.start();
				//regular output
	}
}

//Class Level Lock
//Program to display first 10 numbers followed by 10 characters
//program-2: using synchronize keyword-->Class level Lock 
//If we are not use synchronize keyword, we will get irregular output
class Display{
	public synchronized void displayNumbers(){
		for(int i=1;i<=10;i++){
			System.out.print(i);
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException ie){
				
			}
		}
	}
	public synchronized void displayChracters(){
		for(int i=65;i<=75;i++){
			System.out.print((char)i);
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){
				
			}
		}
	}
}
//User thread class-1
class MyRunnable1 implements Runnable{
	Display d;
	MyRunnable1(Display d){
		this.d=d;
	}
	public void run(){
		d.displayNumbers();
	}
}
//User thread class-2
class MyRunnable2 implements Runnable{
	Display d;
	MyRunnable2(Display d){
		this.d=d;
	}
	public void run(){
		d.displayChracters();
	}
}

//Test class
class ThreadSyncDemo3$0{
	public static void main(String [] args){
		Display d=new Display();
		MyRunnable1 r1=new MyRunnable1(d);
		Thread t1=new Thread(r1);
		
		MyRunnable2 r2=new MyRunnable2(d);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

//***Synchronization Block 
//Program to demonstrate synchronization block
class Display{
	public void wish(String name){
		;;;;;;;;;;;;;;;;//1 lakh lines of code
	  synchronized(this){//current object lock
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){}
			System.out.println(name);
		}
	  }
		;;;;;;;;;;//1 lakh lines of code
	}
}

class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

class ThreadSyncBlock1{
	public static void main(String [] args){
		Display d=new Display();
		MyRunnable r= new MyRunnable(d,"Kohli");
		Thread t=new Thread(r);
		
		MyRunnable r1=new MyRunnable(d,"Dhoni");
		Thread t1=new Thread(r1);
		
		t.start();
		t1.start();
	}
}

//***Synchronization Block 
//Program to demonstrate synchronization block
class Display{
	public void wish(String name){
		;;;;;;;;;;;;;;;;//1 lakh lines of code
	  synchronized(this){//current object lock
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){}
			System.out.println(name);
		}
	  }
		;;;;;;;;;;//1 lakh lines of code
	}
}

class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

class ThreadSyncBlock2{
	public static void main(String [] args){
		Display d=new Display();
		Display d1=new Display();
		MyRunnable r= new MyRunnable(d,"Kohli");
		Thread t=new Thread(r);
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		t.start();
		t1.start();
		//Irregular out put--> in this case we need use Class level lock synchronized block
	}
}

//***Synchronization Block 
//Program to demonstrate synchronization block
class Display{
	public void wish(String name){
		;;;;;;;;;;;;;;;;//1 lakh lines of code
	  //synchronized(Display.class)//Class level lock
	   int x=10;
	    synchronized(x){//CTE: 
		for(int i=1;i<=10;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(1500);
			}catch(InterruptedException ie){}
			System.out.println(name);
		}
	  }
		;;;;;;;;;;//1 lakh lines of code
	}
}

class MyRunnable implements Runnable{
	Display d;
	String name;
	MyRunnable(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

class ThreadSyncBlock4{
	public static void main(String [] args){
		Display d=new Display();
		Display d1=new Display();
		MyRunnable r= new MyRunnable(d,"Kohli");
		Thread t=new Thread(r);
		
		MyRunnable r1=new MyRunnable(d1,"Dhoni");
		Thread t1=new Thread(r1);
		
		t.start();
		t1.start();
		//Irregular out put--> in this case we need use Class level lock synchronized block
	}
}

//Program to demonstrate wait() . notify() methods usage
class ThreadWaitNotifyDemo{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		//Thread.sleep(0,1);-->>bad approach
		synchronized(t){
        	System.out.println("main thread trying to start wait() method");//-->1
		    t.wait();
		}
		System.out.println("main thread got notification");//----------------->>>4
		System.out.println(r.count);	//------------------------------------>>>5	
	}
}

class MyRunnable implements Runnable{
	int count=0;
	public void run(){
		//logic to display count of first 100 numbers
		synchronized(this){
			System.out.println("child thread starts calculation / updtation");//-->>2
			for(int i=1;i<=100;i++){
				count=count+i;
			}
			System.out.println("child thread giving notification..");//-------->>>3
			this.notify();
		}
	}
} 

//Program2 to demonstrate wait() . notify() methods usage
class ThreadWaitNotifyDemo2{
	public static void main(String [] args)throws InterruptedException{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		Thread.sleep(5000);//*********
		synchronized(t){
        	System.out.println("main thread trying to start wait() method");//-->1
			t.wait();//cant execute result because missed notification because of sleep() method
		   // t.wait(10000);
		}
		System.out.println("main thread got notification");//----------------->>>4
		System.out.println(r.count);	//------------------------------------>>>5	
	}
}

class MyRunnable implements Runnable{
	int count=0;
	public void run(){
		//logic to display count of first 100 numbers
		synchronized(this){
			System.out.println("child thread starts calculation / updtation");//-->>2
			for(int i=1;i<=100;i++){
				count=count+i;
			}
			System.out.println("child thread giving notification..");//-------->>>3
			this.notify();
		}
	}
} 


//******DEADLOCK SITUATION-->>MAIN
//Two threads are waiting for each other forever --infinity waiting
class TestA{
	public synchronized void dead1(TestB b){
		System.out.println("main thread (t1) starts execution of dead1() method ");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){}
		b.last();
	}
	public synchronized void last(){
		System.out.println("TestA class: last() method");
	}
}
class TestB{
	public synchronized void dead2(TestA a){
		System.out.println("child thread (t2) starts execution of dead2() method ");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){}
		a.last();
	}
	public synchronized void last(){
		System.out.println("TestB class: last() method");
	}
	
}

class DeadLockSituation extends Thread{
	TestA a =new TestA();
	TestB b=new TestB();
	
	public void run(){
		b.dead2(a);//child thread executes this code
	}
	public void m1(){
		this.start();//child thread running
		
		a.dead1(b);//main thread executes this code
		}

	public static void main(String [] args){
		DeadLockSituation d=new DeadLockSituation();
		d.m1();
	}
}