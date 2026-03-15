package fileio;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {

	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\Mylambigai\\practice\\myl");
		try {
		    if(!Files.exists(p)) {
			       Files.createDirectory(p);
			       System.out.println("Directory is created");
		    }
			else
				System.out.println("Directory already exist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
