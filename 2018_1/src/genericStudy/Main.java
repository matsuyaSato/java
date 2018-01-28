package genericStudy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		StringStack strStack = new StringStack();

		String strElement = strStack.pop();

		strStack.push("Scala");
		strStack.push("Groovy");
		strStack.push("java");

		strElement = strStack.pop();

		if(strElement != null) {
			System.out.println(strElement);
		}

		GenericStack<String> genStack = new GenericStack<>();

		genStack.push("test1");

		String genElement = genStack.pop();
		if(genElement != null) {
			System.out.println(genElement);
		}

		GenericStack<Integer> genStack2 = new GenericStack<>();

		genStack2.push(100);

		Integer genElement2 = genStack2.pop();

		if(genElement2 != null) {
			System.out.println(genElement2);
		}

		List<String> strList = new ArrayList();
		strList.add("java");
		strList.add("Groovy");
		GenericStack<String> gstack = GenericStackUtil.as(strList);

	}
}
