package extendStudy;

class A {

	protected int a;
	public A() {
		System.out.println("A()が呼ばれた。");
	}
	public A(int a0) {
		System.out.println("A(int)が呼ばれた");
		a = a0;
	}

	public int getA() {
		return a;
	}
}
