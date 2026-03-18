package iostream;

import java.io.FileInputStream;

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
