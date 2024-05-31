import java.util.*;

public class CountofBinary {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 0101
        int ones = 0;
        int zeros = 0;
        while (n != 0) { // n>0

            if ((n & 1) == 1) {
                ones++;
            } else {
                zeros++;
            }
            n >>= 1;
        }
        System.out.println(ones);
        System.out.println(zeros);

    }

}
