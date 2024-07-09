import java.io.*;

public class Palendrome {
    public static void main(String[] args) {
        String str = "naman";
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        StringBuilder rev = str1.reverse();
        if (str1.equals(rev)) {
            System.out.println("String is palendrome");
        } else {
            System.out.println("String is not palendrome");
        }

    }

}
