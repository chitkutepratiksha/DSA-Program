import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0, i = 0;

        while (n != 0) {
            int bit = n & 1;
            ans = (int) ((bit * (Math.pow(10, i++))) + ans);

            n = n >> 1;

        }
        System.out.println(ans);

    }

}
