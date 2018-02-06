package lamdaStudy;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));

		students.stream().map(Student::getScore)
		.forEach(System.out::println);
	}
}
