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
public class HashMapWithIteratorExample {

   public static void main(String args[]) {
   
		// create a hash map
		Map<String, String> map = new HashMap<>();
	  
		// put elements to the map
		map.put("Hello", "World");
		map.put("James", "Bond");
		map.put("Good", "Bye");
	  
		// print the size of the map
		System.out.println("Size of map after additions: " + map.size());
      
		// get a set of the entries
		Set set = map.entrySet();
	  
		// get an iterator
		Iterator itr = set.iterator();
	  
		// display elements
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
   }
}