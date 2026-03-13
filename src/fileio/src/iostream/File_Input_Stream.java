package iostream;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.nio.file.Path;
public class File_Input_Stream {

	public static void main(String[] args) {
		try {
			FileInputStream m=new FileInputStream("src/iostream/input.txt");
			System.out.println("Data in file: ");
			int i=m.read();
			while(i!=-1) {
				System.out.print((char)i);
				i =m.read();
			}
			m.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
