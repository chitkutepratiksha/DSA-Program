import java.util.ArrayList ;

public class Monotonic {
    public static boolean Number(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1))
                inc = false;

            if (nums.get(i) < nums.get(i + 1))
                dec = false;

        }
        return inc || dec;

    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        System.out.println(Number(nums));

    }

}
