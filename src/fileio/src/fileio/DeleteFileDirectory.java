package fileio;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.Path;
public class DeleteFileDirectory {

	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\Mylambigai\\practice\\call");
		try{
			Files.deleteIfExists(p);
			}
			catch(NoSuchFileException e){
			System.out.println("No such file/directory exists");
			}

	}

}
