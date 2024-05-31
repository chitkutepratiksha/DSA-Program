import java.util.Scanner;

public class UpdateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int pos = sc.nextInt(); // position for updating the bit
        int n = 5; // 0101

        int bitMask = 1 << pos;

        if (operation == 0) {

            // clear (from 1 to 0)
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        } else {

            // set (from 0 to 1)
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

    }

}
