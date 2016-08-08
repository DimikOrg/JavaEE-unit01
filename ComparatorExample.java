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
public class ComparatorExample {
   public static void main(String args[]) {
      
		// create an array list
		List<Person> list = new ArrayList<>();
		
		// adding persons to the list
		list.add(new Person("James", 20));
		list.add(new Person("John", 15));
		list.add(new Person("Harry", 18));
		list.add(new Person("Mathews", 45));
		list.add(new Person("Andrew", 21));
		
		// displaying the persons list
		System.out.println("Person list before sorting: ");
		for (Person p : list) {
			System.out.println(p.getName());
		}
	  
		// sorting according to name
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person person1, Person person2) {
				String name1 = person1.getName().toUpperCase();
				String name2 = person2.getName().toUpperCase();
	 
				//ascending order
				return name1.compareTo(name2);
			}
		});
		
		// displaying the persons list after sorting by name
		System.out.println("Person list after sorting by name: ");
		for (Person p : list) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		
		// sorting according to age
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person person1, Person person2) {
				int age1 = person1.getAge();
				int age2 = person2.getAge();
	 
				//ascending order
				return age1 - age2;
			}
		});
		
		// displaying the persons list after sorting by age
		System.out.println("Person list after sorting by age: ");
		for (Person p : list) {
			System.out.println(p.getName() + " " + p.getAge());
		}
   }
}