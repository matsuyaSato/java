package instansofStudy;

public class Main {
	public static void main(String[] args) {
		Object obj = new FooService("Hello");
		FooService obj2 = new FooService("test");

		System.out.println(obj instanceof AbstractBaseService);
		System.out.println(obj2 instanceof BaseService);
	}
}
