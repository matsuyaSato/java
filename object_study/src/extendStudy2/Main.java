package extendStudy2;

class Main {
	public static void main(String[] args) {
		Kojin k1 = new Kojin(1001, "三井太郎", 'M');
		Kojin k2 = new Kojin(1002, "住友花子", 'F');
		Houjin h1 = new Houjin(5001, "テスト株式会社", 1);
		Houjin h2 = new Houjin(5002, "株式会社", 2);
		k1.printK();
		k2.printK();
		h1.printH();
		h2.printH();
	}
}
