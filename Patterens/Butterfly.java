public class Butterfly {
    public static void main(String args[]) {
        int n = 4;
        //first part
        for (int i = 1; i <= n; i++) {
            //first part =>first half *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //first part spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // first part => second half *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second part

        for (int i = n; i >= 1; i--) {
            //second part =>first half *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //second part spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //second part =>second half *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
