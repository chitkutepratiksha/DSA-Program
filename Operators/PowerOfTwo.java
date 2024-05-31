
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 2;

        int bitMask = 1 << pos;
        int newNumber = bitMask & n;
        if (newNumber == n) {
            System.out.println("No is power of two");
        } else {
            System.out.println("No is not power of two");
        }

    }

}
