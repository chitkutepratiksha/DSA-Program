import java.util.*;

public class CalculateSum {
    public static void PrintSum(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        PrintSum(a, b);

    }

}
