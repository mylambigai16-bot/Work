package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	public int id;
	public String name;
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
class Serialization{
	public static void main(String[] args) {
		Emp ob=new Emp(8,"Myl");
		String filename="input.txt";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(ob);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		Emp ob1=null;
		try{
			FileInputStream file=new  FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			ob1=(Emp)in.readObject();
			in.close();
			file.close();
			System.out.println("Deserialized");
			System.out.println(ob1.id+" "+ob1.name);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException f) {
			System.out.println(f);
		}
	}
}
 
