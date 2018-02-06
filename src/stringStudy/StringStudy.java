package stringStudy;

public class StringStudy {
	public static void main(String[] args) {
		String aaa = "aaa";
		String bbb = "bbb";

		StringBuilder builder = new StringBuilder();
		builder.append(aaa);
		builder.append(bbb);

		String str = builder.toString();
		System.out.println(str);
	}
}
