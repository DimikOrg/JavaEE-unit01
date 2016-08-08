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
class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}