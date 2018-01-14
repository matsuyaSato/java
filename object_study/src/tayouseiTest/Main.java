package tayouseiTest;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {
//		Kokyaku[] kList = new Kokyaku[SIZE];
		List<Kokyaku> kList = new ArrayList<Kokyaku>();
		kList.add(new Kojin(1001, "三井太郎",'M'));
		kList.add(new Kojin(1002, "住友花子", 'F'));

		for(Kokyaku v : kList) {
			v.print();
		}
	}
}
