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
