package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingDirectory {

	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\Mylambigai\\eclipse-workspace\\Expleo");
		boolean res=Files.exists(p);
		System.out.println("Exists"+res);
		boolean read=Files.isReadable(p);
		System.out.println("Readable "+read);
		System.out.println("Not exist "+Files.notExists(p));
		 System.out.println("writable "+Files.isWritable(p));
		 System.out.println("Excutable "+Files.isExecutable(p));
		 System.out.println();
	}

}
