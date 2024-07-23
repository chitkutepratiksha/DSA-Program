import java.util.*;

public class CalculateMul {

    public static int PrintMul(int a, int b)  {
        int mul = a * b;

        return mul;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("multiplication=" + PrintMul(a, b));

        // int mul = PrintMul(a, b);
        // System.out.println("Multiplication of two number = " + mul);

    }

}
