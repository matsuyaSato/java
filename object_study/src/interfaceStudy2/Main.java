package interfaceStudy2;

class Main {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		I_Kokyaku[] ikList = new I_Kokyaku[SIZE];
		ikList[0] = new Kojin(1001, "三井太郎", 'M');
		ikList[1] = new Kojin(1002, "住友花子", 'F');
		ikList[2] = new Houjin(5001, "株式会社", 1);
		ikList[3] = new Houjin(5002, "株式会社2", 2);
		for(int i = 0; i<SIZE; i++) {
			ikList[i].print();
		}
	}
}
