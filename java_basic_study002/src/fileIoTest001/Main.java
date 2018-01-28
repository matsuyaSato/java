package fileIoTest001;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) {
		String inFile = "/Users/isamu/Desktop/fileStudy/test.dat";
		String outFile = "/Users/isamu/Desktop/fileStudy/test003";
		FileInputStream fis = null;
		GZIPOutputStream gzos = null;

		try {
			fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			int i = fis.read();
			while(i != -1) {
				i = fis.read();
			}
			gzos.flush();
			gzos.close();
			fis.close();

		} catch(IOException e) {
			System.err.println("ファイル操作に失敗しました。");
			try {
				if(fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			} catch(IOException ee) {

			}
		}
	}
}
