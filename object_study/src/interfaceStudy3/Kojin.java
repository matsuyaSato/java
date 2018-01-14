package interfaceStudy3;

class Kojin extends Kokyaku implements I_Kokyaku{
	private char gender;
	public Kojin(int id0, String name0, char gen0, String adr0, String tel0) {
		super(id0, name0, adr0, tel0);
		gender = gen0;
	}
	public void printInfo() {
		String gen;
		if(gender == 'M') {
			gen = "男性";
		} else if(gender == 'F') {
			gen = "女性";
		} else {
			gen = "未記入";
		}
		System.out.println(id + " " + name + " " + gen);
		ren.print();
	}
	public void printLabel() {
		print();
		System.out.println(" 様");
	}
}
