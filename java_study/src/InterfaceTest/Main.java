package InterfaceTest;

public class Main {
	public static void main(String[] args) {
		Foo foo = new DefaultFoo("HelloFoo!");
		System.out.println(foo.say());
	}
}
