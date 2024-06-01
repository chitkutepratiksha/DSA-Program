import java.util.*;

public class Pairsum {
    // public static int[] findPair(int[] arr, int sum) {
    public static List<int[]> findPair(int[] arr, int sum) {

        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        List<int[]> count = new ArrayList<>();
        while (first < last) {
            int result = arr[first] + arr[last];
            if (result == sum) {
                count.add(new int[] { arr[first], arr[last] });
                first++;
                last--;
            } else if (result < sum) {
                first++;
            } else {
                last--;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 4 };
        int sum = 5;

        List<int[]> result = findPair(arr, sum);

        if (!result.isEmpty()) {
            System.out.println("Pair Found");
            for (int[] pair : result) {
                System.out.println("Pair Found" + "(" + pair[0] + "," + pair[1] + ")");
            }
        } else {
            System.out.println("Pair not found");
        }
    }

}
