import java.util.Scanner;

public class Reverse {
    public static int name(int ans) {
        if ((ans > (INT_MAX / 10)) || (ans < (INT_MIN / 10))) {
            return 0;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0, ans = 0;
        while (n != 0) {
            int digit = n % 10;
            name(ans);
            ans = (ans * 10) + digit;

            n = n / 10;
        }
        System.out.println(ans);

    }

}
