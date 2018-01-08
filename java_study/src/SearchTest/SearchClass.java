package SearchTest;

import java.util.Arrays;

public class SearchClass {
	public static void main(String[] args) {
		int[] array = { 1,1,4,5,7,8,11,12,17,21,24};
		int found = Arrays.binarySearch(array, 5);
		System.out.println(found);

		log("ユーザーをとうろくしました。", "UserName", "ken");
		log("エラーが発生しました。", new String[] {"Cannot load file"});

	}

	static void log(String message, String... args) {
		System.out.println(message);
		System.out.println("パラメータ: ");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
