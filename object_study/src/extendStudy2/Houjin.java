package extendStudy2;

class Houjin extends Kokyaku{
	private int type;
	public Houjin(int id0, String name0, int type0) {
		super(id0, name0);
		type = type0;
	}

	void printH() {
		String gyosyu = "";
		print();
		switch(type) {
		case 1:
			gyosyu = "製造業";
			break;
		case 2:
			gyosyu = "サービス業";
			break;
		case 3:
			gyosyu = "その他";
			break;

		}
		System.out.println(gyosyu);
	}
}
