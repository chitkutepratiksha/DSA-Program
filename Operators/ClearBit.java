
public class ClearBit {

    public static void main(String args[])  {

        int n = 5; // 0101
        int pos = 2;

        int bitMask = 1 << pos; // 0001<<2 =>0100

        int notBitMask = ~(bitMask); // 0100=>1011

        int newNumber = notBitMask & n; // 1011 & 0101 =>0001
        System.out.println(newNumber);

    }

}
