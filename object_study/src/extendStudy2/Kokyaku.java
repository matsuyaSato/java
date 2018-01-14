package extendStudy2;

class Kokyaku {
	protected int id;
	protected String name;
	public Kokyaku(int id0, String name0) {
		id = id0;
		name = name0;
	}
	public void print() {
		System.out.println(id + " " + name + " ");
	}
}
