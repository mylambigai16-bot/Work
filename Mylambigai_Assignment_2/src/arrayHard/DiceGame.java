package arrayHard;
import java.util.*;
public class DiceGame {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int arun[] = new int[10];
        int naveen[] = new int[10];

        System.out.println("Enter Arun's chance to roll the dice");
        for(int i=0;i<10;i++)
        	arun[i]=sc.nextInt();
        System.out.println("Enter Naveen's chance to roll the dice");
        for(int j=0;j<10;j++)
        	naveen[j]=sc.nextInt();
        
        int arunSum = 0;
        int naveenSum = 0;

        for(int i = 0; i < 10; i++) {
            arunSum += arun[i];
            naveenSum += naveen[i];
        }

        if(arunSum > naveenSum)
            System.out.println("Arun Wins!!!");
        else if(naveenSum > arunSum)
            System.out.println("Naveen Wins!!!");
        else
            System.out.println("Match Draw");

        System.out.println("Arun Total: " + arunSum);
        System.out.println("Naveen Total: " + naveenSum);
        sc.close();
    }
}
