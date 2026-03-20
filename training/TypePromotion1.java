package training;

public class TypePromotion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d=0.1234;
        double r=(f*b)+(i/c)-(d*s);//promote into double
        ///float r=(f*b)+(i/c)-(d*s);//Can't promote to float coz double is higher data type than float
        System.out.print("Result = "+r);
	}

}
