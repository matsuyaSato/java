package lamdaStudy;

import java.util.ArrayList;
import java.util.List;

public class streamFlatMap {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("ken", 30));
		students.add(new Student("shin", 60));
		students.add(new Student("taka", 100));

//		students.stream().filter(s->s.getScore() > 70)
//		students.stream().limit(2)
		students.stream().sorted((s1, s2) -> s2.getScore() - s1.getScore())
		.forEach(s -> System.out.println(s.getName()));
	}
}
