package fileStudy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewInputStudy {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/isamu/Desktop/test.txt");

		try(InputStream is = Files.newInputStream(path)){
			for(int ch; (ch = is.read()) != -1; ) {
				System.out.print((char)ch);
			}
		} catch(IOException ex) {
			System.err.println(ex);
		}
	}
}
