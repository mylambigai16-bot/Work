package comparable;
import java.util.*;

class Mobile1 implements Comparable<Mobile1> {

    private String name;
    private int ram;
    private int price;

    public Mobile1(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Mobile1 o) {
        return this.ram - o.getRam(); // sort by RAM
    }
}

// Comparator for Price
class PriceCompare implements Comparator<Mobile1> {
    public int compare(Mobile1 m1, Mobile1 m2) {
        return m1.getPrice() - m2.getPrice();
    }
}

// Comparator for Name
class NameCompare implements Comparator<Mobile1> {
    public int compare(Mobile1 m1, Mobile1 m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

public class Main {

    public static void main(String[] args) {

        List<Mobile1> mobileList = new ArrayList<>();

        mobileList.add(new Mobile1("Samsung", 16, 10000));
        mobileList.add(new Mobile1("Vivo", 8, 20000));
        mobileList.add(new Mobile1("Oppo", 4, 30000));

        // 🔹 Sort by Price
        System.out.println("Sorted by Price:");
        Collections.sort(mobileList, new PriceCompare());

        for (Mobile1 m : mobileList) {
            System.out.println(m.getName() + "\t" + m.getRam() + "\t" + m.getPrice());
        }

        // 🔹 Sort by Name
        System.out.println("\nSorted by Name:");
        Collections.sort(mobileList, new NameCompare());

        for (Mobile1 m : mobileList) {
            System.out.println(m.getName() + "\t" + m.getRam() + "\t" + m.getPrice());
        }
    }
}
