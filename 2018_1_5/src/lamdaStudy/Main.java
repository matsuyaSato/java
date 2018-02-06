package lamdaStudy;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Ken", 100),
				new Student("Shin", 60),
				new Student("Takuya", 80)
		};

		Arrays.sort(students,(Student o1, Student o2) -> Integer.compare(o2.getScore(), o1.getScore()));

		Arrays.stream(students).forEach(s->
		System.out.println(s.getName() + ":" + s.getScore()));

		List<String> list = Arrays.asList("test1", "test2", "test3");
		list.forEach(System.out::println);

	}
}