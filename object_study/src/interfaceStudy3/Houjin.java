package interfaceStudy3;

class Houjin extends Kokyaku implements I_Kokyaku{
	private int type;
	public Houjin(int id0, String name0, int type0, String adr0, String tel0) {
		super(id0,name0,adr0, tel0);
		type = type0;
	}
	public void printInfo() {
		String gyosyu;
		print();
		switch(type) {
		case 1:
			gyosyu = "製造業";
			break;
		case 2:
			gyosyu = "サービス業";
			break;
		default:
			gyosyu = "その他";
			break;
		}
		System.out.println(gyosyu);
		ren.print();
	}
	public void printLabel() {
		print();
		System.out.println(" 御中");
	}
}
