package interfaceStudy;

class Main {
	public static void main(String[] args) {
		I_HelloWorld i_hw;
		HelloWorld hw = new HelloWorld();
		i_hw = hw;
		i_hw.print();

		HelloWorldJ hwj = new HelloWorldJ();
		i_hw = hwj;
		i_hw.print();
	}
}
