package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorStudy {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("ken", 100));
		students.add(new Student("shin", 60));
		students.add(new Student("test", 98));

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getScore() < 70) {
				iterator.remove();
			}
		}

		for(Student student:students) {
			System.out.println(student.getName() + ":" + student.getScore());
		}
	}
}
