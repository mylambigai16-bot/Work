package comparable;
import java.util.*;

class Mobile implements Comparable<Mobile> {
    
    private String mname;
    private int ram;
    private int price;

    public Mobile(String mname, int ram, int price) {
        this.mname = mname;
        this.ram = ram;
        this.price = price;
    }

    public String getMname() {
        return mname;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Mobile o) {
        if (this.ram > o.getRam())
            return 1;
        else if (this.ram < o.getRam())
            return -1;
        else
            return 0;
    }
}

public class Comp {

    public static void main(String[] args) {

        List<Mobile> mobileList = new ArrayList<>();

        mobileList.add(new Mobile("Redmi", 8, 10000));
        mobileList.add(new Mobile("Vivo", 4, 20000));
        mobileList.add(new Mobile("Samsung", 16, 30000));

        Collections.sort(mobileList);

        System.out.println("After sorting:");
        System.out.println("Name\tRam\tPrice");

        for (Mobile m : mobileList) {
            System.out.println(m.getMname() + "\t" + m.getRam() + "\t" + m.getPrice());
        }
    }
}
