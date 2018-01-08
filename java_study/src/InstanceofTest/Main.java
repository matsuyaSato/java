package InstanceofTest;

public class Main {
	public static void main(String[] args) {
		Object obj = new FooService("hello");
		System.out.println(obj instanceof FooService);
		System.out.println(obj instanceof BaseService);
		System.out.println(obj instanceof Integer);
	}
}
