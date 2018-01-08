
public class StaticTest {
	static final String GREETING_MESSAGE = "Hello";
	static String staticField = "World";

	static String staticMethod() {
		return "yay!";
	}

	String instanceField = GREETING_MESSAGE;

//	String instanceField = "Hello";

	String instanceMethod() {
		return instanceField + " " + staticField + " " + staticMethod();
	}
}
