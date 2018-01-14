package tayouseiStudy;

abstract class Kokyaku {
	protected String name;
	protected int id;
	public Kokyaku(int id0, String name0) {
		id = id0;
		name = name0;
	}
	public abstract void print();
}
