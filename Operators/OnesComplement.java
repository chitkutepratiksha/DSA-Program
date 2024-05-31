import java.util.Scanner;

public class OnesComplement {
    public static int name(int n) {
        if (n == 0)
            System.out.println(1);
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int mask = 0;
        name(n);
        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        m = mask & (~n);
        System.out.println(m);

    }

}
