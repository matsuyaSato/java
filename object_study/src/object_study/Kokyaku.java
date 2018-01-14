package object_study;

class Kokyaku {
	private int id;
	private String name;
	private Renrakusaki ren;

	public Kokyaku(int id0, String name0) {
		id = id0;
		name = name0;
	}
	public void setRenrakusaki(Renrakusaki ren0) {
		ren = ren0;
	}

	public void print() {
		System.out.println(id + " " + name);
		ren.print();
	}

}
