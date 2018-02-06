package lamdaStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudy {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("murata", "okada", "tanimoto");

		List<String> newList = list.stream()
				.filter(p -> p.length() > 5)
				.map(p -> "[" + p + "]")
				.collect(Collectors.toList());

		newList.forEach(System.out::println);

	}
}
