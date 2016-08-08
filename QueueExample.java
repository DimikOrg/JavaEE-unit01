import java.util.*;

/**
* <h1>JavaEE Online Course</h1>
* <h2>Collections Framework</h2>
* <p>
* This classs represents the usage of Java 
* Collection Framework as demonstrated on
* the Online Course conducted by Dimik Computing.
* Feel free to fork and try it on your own.
* </p>
*
* @author  Sharif Ahmed (https://github.com/sharifahmed)
* @version 1.0
* @since   2016-07-01 
*/
public class QueueExample {

   public static void main(String args[]) {
		
		// create a queue
		Queue queue = new LinkedList();
		
		// adding into the queue
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		// displaying the contents of the queue
		System.out.println("Contents of the queue: " + queue);
		
		// popping an element
		try {
			queue.remove();
		} catch (NoSuchElementException e) {
			System.out.println("empty queue");
		}	
		
		// displaying the contents of the queue
		System.out.println("Contents of the queue: " + queue);
   }
}