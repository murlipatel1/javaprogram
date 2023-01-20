// Java program to demonstrate how to Sort HashSet using
// Comparable interface

import java.util.*;

// Student class implements comparable interface
class Student implements Comparable<Student> {

	Integer marks;

	Student(Integer marks) { this.marks = marks; }

	// override toString method
	public String toString() { return (" " + this.marks); }

	// Override compareTo method to sort HashSet in
	// ascending order
	public int compareTo(Student stu)
	{
		return this.marks.compareTo(stu.marks);
	}
}

class GFG {
	public static void main(String[] args)
	{

		// New HashSet
		HashSet<Student> set = new HashSet<>();

		// Adding elements to the set
		set.add(new Student(500));
		set.add(new Student(300));
		set.add(new Student(400));
		set.add(new Student(100));
		set.add(new Student(200));

		// Print Before sort
		System.out.println("Before sort elements in ascending order : "
			+ set);

		// TreeSet to sort HashSet using comparable
		// interface
		TreeSet<Student> tree_set = new TreeSet<>(set);

		// Print after sorting
		System.out.println("After sort elements in ascending order : "
			+ tree_set);
	}
}
