package overRide;

class Main {
	public static void main(String[] args) {
		A a = new A();
		a.setA(10);
		a.print();
		B b = new B();
		b.setA(10);
		b.print();
	}
}
