package fileio;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.Path;
public class DeleteFileDirectory {

	public static void main(String[] args) {
		Path path=Paths.get("C:\\Users\\Mylambigai\\practice\\call");
		try{
			Files.deleteIfExists(path);
		}
		catch(NoSuchFileException e){
			System.out.println("No such file/directory exists");
		}
		catch(DirectoryNotEmptyException e){
			System.out.println("Directory is not empty.");
		}
		catch(IOException e){
			System.out.println("No such file/directory exists");
		}
		System.out.println("Deletion successful.");
	}

}
