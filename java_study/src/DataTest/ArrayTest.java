package DataTest;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		System.out.println(array[0]);

		int[] array2 = new int[11];
		for(int i = 0; i<11; i++) {
			if(i == 0) {
				array2[i] = 0;
			} else if(i == 1) {
				array2[i] = 1;
			} else {
				array2[i] = array2[i - 1] + array2[i - 2];
			}
		}

		for(int value: array2) {
			System.out.println(value);
		}

		int[] array3 = { 1,1,2,3,5,8,13};
		int[] newArray1 = new int[array.length + 3];
		int[] newArray2 = Arrays.copyOf(array2, array.length + 3);

		newArray2[7] = 21;
		System.out.println(newArray2[7]);

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}
}
