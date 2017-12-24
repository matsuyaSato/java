package fileio;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {				
		FileReader fr = new FileReader("/Users/isamu/Desktop/test.dat");
		System.out.println("すべてのデータを読み込んで表示");
		int i = fr.read();
		while(i != -1){
			char c = (char) i;
			System.out.println(c);
			i = fr.read();
		}
		System.out.println("ファイル末尾");
		fr.close();
	}
}
