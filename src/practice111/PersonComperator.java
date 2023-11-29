package practice111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonComperator {
	
	 public static void main(String[] args) {
	        // Create a list of Person objects
	        List<Person> personList = new ArrayList<>();
	        personList.add(new Person("John", 15));
	        personList.add(new Person("John", 25));
	        personList.add(new Person("Alice", 30));
	        personList.add(new Person("Bob", 22));
	        personList.add(new Person("Bob", 30));


	        Collections.sort(personList, Comparator.comparingInt(Person::getAge));

	        for (Person person : personList) {
	            System.out.println(person.getName() + " - " + person.getAge() + " years old");
	        }
	    }


}
