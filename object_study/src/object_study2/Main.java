package object_study2;

class Main {
	public static void main(String[] args) {
//		Kokyaku k1 = new Kokyaku(1001,"三井太郎","東京都大田区", "03-111-1111");
//		Kokyaku k2 = new Kokyaku(1002, "住友花子", "大阪市南区","06-2222-2222");
//		k1.print();
//		k2.print();

		Kokyaku kList[] = new Kokyaku[2];
		kList[0] = new Kokyaku(1001, "三井太郎", "東京都大田区", "03-1111-1111");
		kList[1] = new Kokyaku(1002,"住友花子", "大阪市南区", "06-1111-2222");

		for(int i = 0; i<kList.length; i++) {
			kList[i].print();
		}
	}
}
