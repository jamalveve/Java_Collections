package com.java.SetCollection;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class DefaultConstOfHashSet {

	public static void main(String[] args) {
		// Create a HashSet using the default constructor
		HashSet<String> fruits = new HashSet<>();

		// Adding elements to the HashSet
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		// Attempting to add a duplicate element
		boolean isAdded = fruits.add("Apple"); // This will return false
		System.out.println("Was Apple added again? " + isAdded);

		// Displaying the HashSet
		System.out.println("Fruits in the HashSet: " + fruits);

		// Removing an element
		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);

		// Checking if the HashSet contains a specific element
		boolean hasCherry = fruits.contains("Cherry");
		System.out.println("Does the HashSet contain Cherry? " + hasCherry);

		// Iterating through the HashSet
		System.out.println("Iterating through the HashSet:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(4);

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		// Attempting to add a duplicate element
		boolean isAddeds = numbers.add(3); // This will return false
		System.out.println("Was 3 added again? " + isAddeds);

		// Displaying the HashSet
		System.out.println("setOfNumbers in the HashSet: " + numbers);

		// Removing an element
		numbers.remove(2);
		System.out.println("After removing 2: " + numbers);

		// Checking if the HashSet contains a specific element
		boolean hasFour = numbers.contains(4);
		System.out.println("Does the HashSet contain 4? " + hasFour);

		// Iterating through the HashSet
		System.out.println("Iterating through the HashSet:");
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// student constructor

		HashSet<Student> students = new HashSet<>();
		students.add(new Student("jamal", 24678));
		students.add(new Student("venky", 24667));
		students.add(new Student("abi", 246344));

		// atmepting to add deuplocate student obj

		boolean isAddedStudent = students.add(new Student("abi", 246344));

		System.out.println("Was duplicate Alice added? " + isAddedStudent);

		// Displaying the HashSet
		System.out.println("Students in the HashSet: " + students);

		// Iterating through the HashSet
		System.out.println("Iterating through the HashSet:");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
class Student {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

}
