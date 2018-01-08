package ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public static void main(String...args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getScore()<70) {
				iterator.remove();
			}
		}
		for(Student student: students) {
			System.out.println(student.getName() + ":" + student.getScore());
		}
	}

}
