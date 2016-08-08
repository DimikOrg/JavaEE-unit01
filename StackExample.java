import java.util.*;

/**
* <h1>JavaEE Online Course</h1>
* <h2>Collections Framework</h2>
* <p>
* These classes represents the usage of Java 
* Collection Framework as demonstrated on
* the Online Course conducted by Dimik Computing.
* Feel free to fork and try it on your own.
* </p>
*
* @author  Sharif Ahmed (https://github.com/sharifahmed)
* @version 1.0
* @since   2016-07-01 
*/
public class StackExample {

   public static void main(String args[]) {
		
		// create a stack
		Stack st = new Stack();
		
		// pushing into the stack
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		// displaying the contents of the stack
		System.out.println("Contents of the stack: " + st);
		
		// popping an element
		try {
			st.pop();
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}	
		
		// displaying the contents of the stack
		System.out.println("Contents of the stack: " + st);
		
		// search in the stack
		System.out.println("Does stack contains 5: " + st.search(5));
		System.out.println("Does stack contains 1: " + st.search(1));
   }
}