package com.practice.pgms;
import java.util.LinkedList;
public class ShallowCopyExample {

	public static void main(String[] args) {

		     // Create a LinkedList with mutable Person objects
		     LinkedList<Person> originalList = new LinkedList<>();
		     originalList.add(new Person("Alice"));
		     originalList.add(new Person("Bob"));

		     // Clone the LinkedList
		     @SuppressWarnings("unchecked")
		     LinkedList<Person> clonedList = (LinkedList<Person>) originalList.clone();

		     // Print the original and cloned lists
		     System.out.println("Original List before modification: " + originalList);
		     System.out.println("Cloned List before modification: " + clonedList);

		     // Modify an element in the cloned list
		     clonedList.get(0).setName("Charlie");

		     // Print the lists after modification
		     System.out.println("Original List after modification: " + originalList);
		     System.out.println("Cloned List after modification: " + clonedList);

	}

}


//Mutable class
class Person {
 private String name;
 
 public Person(String name) {
     this.name = name;
 }
 
 public String getName() {
     return name;
 }
 
 public void setName(String name) {
     this.name = name;
 }
 
 @Override
 public String toString() {
     return name;
 }
}

