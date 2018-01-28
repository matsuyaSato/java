package collectionStudy;

import java.util.Arrays;

public class ArrayStudy {
	public static void main(String[] args) {
		int[] array = { 15,1,1,2,3,5,8,13 };
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
