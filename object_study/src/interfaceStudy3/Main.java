package interfaceStudy3;

class Main {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		I_Kokyaku[] kList = new I_Kokyaku[SIZE];
		kList[0] = new Kojin(1001, "三井太郎", 'M', "東京都大田区", "03-1111-1111");
		kList[1] = new Kojin(1002, "住友花子", 'F', "大阪市南区", "06-1111-1111");
		kList[2] = new Houjin(5001, "株式会社", 1, "横浜市", "04-1111-1111");
		kList[3] = new Houjin(5002, "株式会社22", 2, "神戸市", "07-0000-0000");
		System.out.println("*** 顧客情報表示 ***");
		for(int i = 0; i<SIZE; i++) {
			kList[i].printInfo();
		}
		System.out.println("*** 郵送ラベル印刷 ***");
		for(int i = 0; i<SIZE; i++) {
			kList[i].printLabel();
		}
	}
}
