/*
 * import java.util.Scanner;
 * 
 * public class NegativeDtoB {
 * public static void main(String args[]) {
 * long long int n;
 * Scanner no = new Scanner(System.in);
 * 
 * n = no.nextInt();
 * Unsigned long long int i = 0, ans = 0;
 * if (n < 0) {
 * n = (int) ((Math.pow(2, 16)) + n);
 * }
 * System.out.println(n);
 * while (n != 0) {
 * int lastBit = (n & 1);
 * ans = (int) (Math.pow(10, i++) * lastBit);
 * n = n >> 1;
 * 
 * System.out.println(ans);
 * }
 * System.out.println(ans);
 * }
 * 
 * }
 */
