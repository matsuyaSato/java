package stringStudy;

import java.util.ArrayList;
import java.util.List;

public class JoinStudy {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("this");
		stringList.add("is");
		stringList.add("a");
		stringList.add("pen");

		String message = String.join(" ", stringList);

		System.out.println(message);
	}
}
