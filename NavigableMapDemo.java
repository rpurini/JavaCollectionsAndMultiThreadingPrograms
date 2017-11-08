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