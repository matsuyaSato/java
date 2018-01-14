package object_study;

class Main {
	public static void main(String[] args) {
		Kokyaku k1 = new Kokyaku(1001, "三井太郎");
		Renrakusaki r1 = new Renrakusaki("東京都大田区...", "03-1111-1111");

		k1.setRenrakusaki(r1);
		Kokyaku k2 = new Kokyaku(1002,"住友花子");
		Renrakusaki r2 = new Renrakusaki("大阪市南区...", "06-0222-2222");

		k2.setRenrakusaki(r2);
		k1.print();
		k2.print();

	}
}
