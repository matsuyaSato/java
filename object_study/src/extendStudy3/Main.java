package extendStudy3;

class Main {
	public static void main(String[] args) {
		Kojin k1 = new Kojin(1001, "三井太郎", 'M', "東京都大田区", "03-1111-1111");
		Kojin k2 = new Kojin(1002, "住友花子", 'F', "大阪市南区", "06-1111-2222");
		Houjin h1 = new Houjin(5001,"株式会社", 1, "横浜市", "04-333-222");
		Houjin h2 = new Houjin(5002, "株式会社テスト", 2, "神戸市", "07-444-333");
		k1.printK();
		System.out.println();
		k2.printK();
		System.out.println();
		h1.printH();
		System.out.println();
		h2.printH();
		System.out.println();


	}
}
