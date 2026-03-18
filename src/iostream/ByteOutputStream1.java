package iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutputStream1 {

	public static void main(String[] args) {
		char[] b=new char[128];
		try (FileReader fr=new FileReader(args[0]);
				FileWriter fw=new FileWriter(args[1])){
			int c=0;
			int read=0;
			while((read=fr.read(b))!=-1) {
				fw.write(b);
				System.out.print(Arrays.toString(b));
				c=c+read;
			}
			System.out.println("Total count: "+c+" charcters");
		}
		catch(FileNotFoundException f) {
			System.out.println("File not found: "+f);
		}
	catch(IOException e) {
		System.out.println("IOException:"+e);
	}
}
				

	}
