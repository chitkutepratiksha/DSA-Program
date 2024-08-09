import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0, ans = 0;
        while (n != 0) {
            int digit = n % 10;

            ans = ans + (int) (Math.pow(2, i++) * digit);

            n = n / 10;
        }
        System.out.println(ans);

    }

}
