
public class GetShift {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 2;

        int bitMask = 1 << pos; // 0001<<2 =>0100

        if ((bitMask & n) == 0) { // 0100& 0101 => 0100
            System.out.println("Get bit is zero");
        } else {
            System.out.println("Get bit is one");
        }

    }

}
