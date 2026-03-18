package list;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        System.out.println("Array size:" + arr.size());

        arr.add("M");
        arr.add("Y");
        arr.add("L");
        arr.add("U");
        arr.add(" ");
        arr.add(1,"A");

        System.out.println("Array size: " + arr.size());
        System.out.print(arr);
    }
}
