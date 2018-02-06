package fileStudy;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewOutputStudy {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/isamu/Desktop/test.txt");
		byte[] data = new byte[] {0x41,0x42,0x43};
		try(OutputStream stream = Files.newOutputStream(path,StandardOpenOption.APPEND,
				StandardOpenOption.CREATE,StandardOpenOption.WRITE)){
			stream.write(data);
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}
