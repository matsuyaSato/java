package lamdaStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethod {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Murata");
//		list.add("Okada");
//		list.add("Tanimoto");
//		list.add("Sakamoto");
//
//		Map<Integer, List<String>> map = new HashMap<>();
//		list.forEach(name -> {
//			Integer nameLen = name.length();
//
//			List<String> valueList = map.get(nameLen);
//			if(valueList == null) {
//				valueList = new ArrayList<>();
//				map.put(nameLen, valueList);
//			}
//			valueList.add(name);
//		});
//		System.out.println(map);

		List<String> list = new ArrayList<>();
		list.add("Murata");
		list.add("Okada");
		list.add("Tanimoto");
		list.add("Sakamoto");

		Map<Integer,List<String>> map = new HashMap<>();
		list.forEach(name -> {
			Integer nameLen = name.length();
			List<String> valueList = map.computeIfAbsent(nameLen, key -> new ArrayList<>());
			valueList.add(name);
		});
		System.out.println(map);


	}
}
