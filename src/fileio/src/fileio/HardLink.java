package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HardLink {

	public static void main(String[] args) {
		Path current=Paths.get("C:\\Users\\Mylambigai\\eclipse-workspace\\Expleo");
		Path hardLink=Paths.get("c:\\Expleo");
				
		try {
			Files.createLink(hardLink,current);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

}
