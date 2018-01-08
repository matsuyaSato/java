package MapStudy;
import java.util.HashMap;
import java.util.Map;


public class MapTest {
	public static void main(String...args) {
		Map<String,Integer> scores = new HashMap<>();

		scores.put("ken", 100);
		scores.put("Shin", 60);
		scores.put("Takuya",80);
		System.out.println("Map1: " + scores.toString());

		scores.put("Shin", 50);
		System.out.println("Map2 : " + scores.toString());

		Integer takuyaScore = scores.get("Takuya");
		System.out.println("Map3 : " + takuyaScore);

		scores.remove("Shin");
		System.out.println("Map4 : " + scores.toString());

		int size = scores.size();
		System.out.println(size);

		boolean existken = scores.containsKey("ken");
		System.out.println(existken);

		boolean exist80 = scores.containsValue(80);
		System.out.println("80 :" + exist80);
	}
}
