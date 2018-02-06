package lamdaStudy;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfStud {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Murata");
		list.add("okada");
		list.add("tanimoto");

		list.removeIf(s -> 5 >= s.length());
		list.forEach(System.out::println);
	}
}
