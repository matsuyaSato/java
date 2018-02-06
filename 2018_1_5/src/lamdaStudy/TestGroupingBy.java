package lamdaStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupingBy {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));
		students.add(new Student("Sakamoto", 100));

		Map<Integer, List<Student>> map = students.stream()
				.collect(Collectors.groupingBy(Student::getScore));

		List<Student> perfects = map.get(100);
		perfects.forEach(s -> System.out.println(s.getName()));
	}
}
