package java8.naveenautomationlabs.listwithObjects;

import java.util.ArrayList;
import java.util.List;

public class TestStudentClass {

	/*
	 * Find Student Name Holding Highest Marks || List with Objects & Streams ||
	 * Learn: Store Java Objects in a List, List with Objects & Streams, Apply
	 * Stream with Filters
	 * 
	 */

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

//		add students in the list
		studentList.add(new Student("Jwala", 1, 100, 25));
		studentList.add(new Student("Sonu", 1, 80, 20));
		studentList.add(new Student("Monu", 1, 90, 19));
		studentList.add(new Student("Anu", 1, 79, 17));

//		Total number of students in the list
		System.out.println("Total number of students: " + studentList.size());

//		Print all the students form the list
		for (Student s : studentList) {
			System.out.println(s);
		}

//		Print all the students form the list : Using streams
		studentList.stream().forEach(e -> System.out.println(e));

//		Print the name of the students who got marks greater than 80
		studentList.stream().filter(e -> e.getMarks() > 80)
				.forEach(e -> System.out.println(e.getName() + "  " + e.getMarks()));

//		Print the name of the student who got the highest marks
		int highestMarks = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();

		System.out.println("Highest marks: " + highestMarks);

		studentList.stream().filter(e -> e.getMarks() == highestMarks).forEach(e -> System.out.println(e));

	}

}
