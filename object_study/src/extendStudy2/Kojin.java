package extendStudy2;

class Kojin extends Kokyaku{
	private char gender;
	public Kojin(int id0, String name0, char gen0) {
		super(id0, name0);
		gender = gen0;
	}

	public void printK() {
		String gen;
		print();
		if(gender == 'M') {
			gen = "男性";
		} else if(gender == 'F') {
			gen = "女性";
		} else {
			gen = "未記入";
		}
		System.out.println(gen);
	}

}
