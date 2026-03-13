package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedstream {

	public static void main(String[] args) { 
		try(BufferedReader in=new BufferedReader(new FileReader(args[0]));
				BufferedWriter out=new BufferedWriter(new FileWriter(args[1]))){
			String s="";
			while((s=in.readLine())!=null) {
				out.write(s);
				//out.newLine();
			}
		}
		catch(FileNotFoundException f) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
