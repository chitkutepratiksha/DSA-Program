import java.util.*;

public class FindNumber{
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int x = sc.nextInt();
        int a[][] = new int[rows][cols];
        // input
        // cols
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == x) {
                    System.out.print("x found at index" + i + "," + j + " ");
                }

            }

        }

    }
}
