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