package queue;

import java.util.LinkedList;

public class Main1 {

	 public static void main(String[] args)
	    {
	        LinkedList<String> queue = new LinkedList<String>();
	 
	        queue.add("A");     // Insert `A` into the queue
	        queue.add("B");     // Insert `B` into the queue
	        queue.add("C");     // Insert `C` into the queue
	        queue.add("D");     // Insert `D` into the queue
	 
	        // Prints the front of the queue (`A`)
	        System.out.println("The front element is " + queue.peek());
	 
	        queue.remove();     // removing the front element (`A`)
	        queue.remove();     // removing the front element (`B`)
	 
	        // Prints the front of the queue (`C`)
	        System.out.println("The front element is " + queue.peek());
	 
	        // Returns the total number of elements present in the queue
	        System.out.println("The queue size is " + queue.size());
	 
	        // check if the queue is empty
	        if (queue.isEmpty()) {
	            System.out.println("The queue is empty");
	        }
	        else {
	            System.out.println("The queue is not empty");
	        }
	    }
	}

