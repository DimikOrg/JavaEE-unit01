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
public class ArrayListWithIteratorExample {
   public static void main(String args[]) {
      
		// create an array list
		List<String> list = new ArrayList<>();
		System.out.println("Initial size of list: " + list.size());

		// add elements to the array list
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");
		System.out.println("Size of list after additions: " + list.size());

		// display all the contents using iterator
		System.out.print("Contents of list:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
	  
		// display all the contents using for-each
		System.out.print("\nContents of list:");
		for(String str : list) {
			System.out.print(" " + str);
		}
   }
}