package java_string;

public class Main {
	public static void main(String[] args){
		String s1 = "";
		String s2 = "Java";
		String s3 = "java";
		String s4 = " test ";
		if(s2.equals(s3)){
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("大文字、小文字の区別なし。");
		}
		System.out.println("s1の長さは" + s1.length());
		if(s1.isEmpty()){
			System.out.println("空文字です。");
		}
		
		System.out.println(s4);
		
		
		//StringBuilderクラス
		
		StringBuilder sb = new StringBuilder();
		sb.append("test");
		sb.append(" suruyo");
		String s = sb.toString();
		System.out.println(s);
		

		System.out.printf("製品番号%s-%02d", "SJV",3);
		
	}
}
