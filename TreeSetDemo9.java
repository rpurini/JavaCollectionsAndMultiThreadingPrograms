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