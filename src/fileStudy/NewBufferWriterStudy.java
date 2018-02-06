package fileStudy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferWriterStudy {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/isamu/Desktop/test.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}
