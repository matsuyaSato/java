package tayouseiStudy;

class Main {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		Kokyaku[] kList = new Kokyaku[SIZE];
		kList[0] = new Kojin(1001, "三井太郎", 'M');
		kList[1] = new Kojin(1002, "住友花子", 'F');
		kList[2] = new Houjin(5001, "株式会社", 1);
		kList[3] = new Houjin(5002, "株式会社", 2);
		for(int i=0; i<SIZE; i++) {
			kList[i].print();
		}


	}
}
