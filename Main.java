package queue;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
	    // Creating Queue using the LinkedList class
	    LinkedList<Object> numbers = new LinkedList<Object>();

	    // enqueue
	    // insert element at the rear of the queue
	    numbers.offer(1);
	    numbers.offer(2);
	    numbers.offer(3);
	    System.out.println("Queue: " + numbers);

	    // dequeue
	    // delete element from the front of the queue
	    int removedNumber = (Integer) numbers.poll();
	    System.out.println("Removed Element: " + removedNumber);

	    System.out.println("Queue after deletion: " + numbers);
	    }
	}