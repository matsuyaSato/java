package extendStudy;

class B extends A{
	private int b;
	public B() {
		System.out.println("B()が呼ばれた");
	}
	public B(int a0, int b0) {
		super(a0);
		b = b0;
		System.out.println("B(int,int) が呼ばれた ");
	}
	public int getB() {
		return b;
	}

}

