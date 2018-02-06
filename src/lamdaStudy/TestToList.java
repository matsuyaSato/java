package lamdaStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestToList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

		String joined = list.stream()
				.filter(p -> p.length() > 5)
				.collect(Collectors.joining(","));

		System.out.println(joined);
	}
}
