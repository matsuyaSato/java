package extendStudy3;

class Kokyaku {
	protected int id;
	protected String name;
	protected Renrakusaki ren;

	public Kokyaku(int id0, String name0,String adr0, String tel0) {
		id = id0;
		name = name0;
		ren = new Renrakusaki(adr0, tel0);
	}
	public void print() {
		System.out.print(id + " " + name);
		ren.print();
	}
}
