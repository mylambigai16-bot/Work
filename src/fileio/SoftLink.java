package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\Mylambigai\\eclipse-workspace\\Expleo");
		Path symLink=Paths.get("c:\\Expleo");
		try {
			Files.createSymbolicLink(symLink,p);
		}
		
		catch(IOException x) {
			System.out.println(x);
		}
		catch(UnsupportedOperationException x) {
			System.out.println(x);
		}
	}

}
