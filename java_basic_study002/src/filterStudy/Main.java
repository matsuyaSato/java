package filterStudy;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args)throws IOException {
		try (FileWriter fw = new FileWriter("/Users/isamu/Desktop/fileStudy/test.dat", true)){
			fw.write('B');
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです。");
		}
	}
}
