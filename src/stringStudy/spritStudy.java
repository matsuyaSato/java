package stringStudy;

import java.util.regex.Pattern;

public class spritStudy {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s+");
		String sentence = "This       is a pen.";
		String[] words = pattern.split(sentence);

		for(String word:words) {
			System.out.println(word);
		}
	}
}
