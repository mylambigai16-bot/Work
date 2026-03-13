package iostream;
import java.io.FileOutputStream;
public class File_output_Stream {

	public static void main(String[] args) {
		String data="This is File output stream comncept";
		try {
			FileOutputStream out=new FileOutputStream("src/iostream/input.txt");
			byte[] array=data.getBytes();
			out.write(array);
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
