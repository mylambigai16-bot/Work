package fileio;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
public class CreateFile {

	public static void main(String[] args) {
		Path p = Paths.get("C:\\Users\\Mylambigai\\practice\\call\\hell");
		try {
			if(!Files.exists(p)){
				Files.createFile(p);
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
