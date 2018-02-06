package lamdaStudy;

import java.util.List;

public class Group {

	private List<Student> students;

	public void add(Student student) {
		students.add(student);
	}

	public List<Student> getStudents(){
		return students;
	}
}
