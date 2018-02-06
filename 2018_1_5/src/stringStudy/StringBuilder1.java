package stringStudy;

import java.util.ArrayList;
import java.util.List;

public class StringBuilder1 {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("this");
		stringList.add("is");
		stringList.add("a");
		stringList.add("pen");

		StringBuilder message = new StringBuilder();
		for(String word : stringList) {
			message.append(word);
			message.append(" ");
		}

		if(message.length() > 0) {
			message.deleteCharAt(message.length() - 1);
		}

		System.out.println(message.toString());
	}
}
