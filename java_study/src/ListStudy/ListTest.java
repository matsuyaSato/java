package ListStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String...args) {
		List<String> names = new ArrayList<>();
		names.add("ken");
		names.add("shin");
		names.add("Takuyaa");
		System.out.println("1の中身: " + names.toString());

		names.set(2, "Satoshi");
		System.out.println("2の中身" + names.toString());

		names.set(0, "Makoto");
		System.out.println("3の中身" + names.toString());

		String thirdName = names.get(2);
		System.out.println("2番目の要素" + thirdName);

		int takuyaIndex = names.indexOf("Satoshi");
		System.out.println("takuyaのいち：" + takuyaIndex);
		names.set(1,"test");

		boolean exists = names.contains("shin");
		System.out.println(exists);

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(13);
		list.add(2);

		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};

		Collections.sort(list,c);
		System.out.println(list);

		List<String> list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");

		for(String element: list2) {
			System.out.println(element);
		}

		for(Iterator<String> iterator = list2.iterator(); iterator.hasNext();) {
			String element = iterator.next();
			System.out.println(element);
		}

	}
}
