<<<<<<< HEAD
public class Palendromic {
    public static void main(String args[]) {
        int n = 5, k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

}
=======
public class Palendromic {
    public static void main(String args[]) {
        int n = 5, k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

}
>>>>>>> ae6b464ba6b3dcf8b3a4f7aab3141c86812f4e52
