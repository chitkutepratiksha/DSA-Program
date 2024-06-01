import java.util.*;

public class SpiralOrder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // intiallize
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {

            // first row
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(a[rowStart][col] + " ");
            }

            rowStart++;
            // last column
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(a[row][colEnd] + " ");
            }
            colEnd--;
            // last row
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(a[rowEnd][col] + " ");
            }
            rowEnd--;
            // first column
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(a[row][colStart] + " ");
            }
            colStart++;
        }

    }

}
