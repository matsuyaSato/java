package optionalStudy;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		OptionalStack<String> optStack = new OptionalStack<>();

		Optional<String> optional = optStack.pop();
		String optElement = optional.orElse("empty");

		System.out.println(optElement);

		optStack.push("Scala");
		optStack.push("Groovy");
		optStack.push("java");

		optional = optStack.pop();

		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		optional = optStack.pop();

		optional.ifPresent(System.out::println);
	}
}
