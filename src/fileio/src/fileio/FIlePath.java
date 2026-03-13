package fileio;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FIlePath {

	public static void main(String[] args) {
		/*FileSystem fs= FileSystems.getDefault();
		Path p=fs.getPath("C:\\Users\\Myl\\eclipse-workspace\\Expleo");
		Path ps=p.subpath(2, 4);
		System.out.println(p);
		System.out.println(ps );*/
		Path p1=Paths.get("C:\\Users\\Mylambigai\\eclipse-workspace\\Expleo");
		Path nP=p1.normalize();
		Path p2=Paths.get("C:\\Users\\Myl\\eclipse-workspace\\Expleo");
		System.out.println("Normalized path:"+nP);
		Path subP=p1.subpath(1, 3);
		System.out.println(subP);
		System.out.println("Get file name: "+p1.getFileName());
		System.out.println("Get parent: "+p1.getParent());
		System.out.println("Get name count: "+p1.getNameCount());
		System.out.println("Get root: "+p1.getRoot());
		System.out.println("Is absolute path: "+p1.isAbsolute());
		System.out.println("To absolute path: "+p1.toAbsolutePath());
		System.out.println("To URI: "+p1.toUri());
		if(p1.equals(p2))
			System.out.println("Equals"); 
		else
			System.out.println("Not equal");

	}

}
