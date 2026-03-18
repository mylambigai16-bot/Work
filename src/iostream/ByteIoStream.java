package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIoStream {

	public static void main(String[] args) {
		byte[] b=new byte[128];
		try (FileInputStream fin=new FileInputStream("src/iostream/input.txt ");
			FileOutputStream fout=new FileOutputStream("src/ioStream/output.txt")){
				System.out.println("Bytes available: "+fin.available());
				int c=0;
				int read=0;
				while((read =fin.read(b))!=-1) {
					fout.write(b);
					c=c+read;
					
				}
				System.out.println("Total count:"+c);
		}
			catch(FileNotFoundException f) {
				System.out.println("File not found: "+f);
			}
		catch(IOException e) {
			System.out.println("IOException:"+e);
		} 
	}

}
