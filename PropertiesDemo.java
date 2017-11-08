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