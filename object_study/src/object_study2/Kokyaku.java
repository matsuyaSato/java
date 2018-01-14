package object_study2;

class Kokyaku {
	private int id;
	private String name;
	private Renrakusaki ren;

	public Kokyaku(int id0, String name0, String adr0, String tel0) {
		id = id0;
		name = name0;
		ren = new Renrakusaki(adr0, tel0);
	}
	public void print() {
		System.out.println(id + " " + name);
		ren.print();
	}
}
