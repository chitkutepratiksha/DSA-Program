import java.util.ArrayList;

//Sorted and rotated Arraylist

public class PairSumSR {

    public static boolean Sum(ArrayList<Integer> list, int target) {
        int bp = -1;// breaking point ...............Not a valid index
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }

        }
        int rp = bp;// largest number in list
        int lp = bp + 1;// smallest nummber in array
        int n = list.size();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(Sum(list, target));

    }

}
