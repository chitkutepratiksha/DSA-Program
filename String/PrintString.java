<<<<<<< HEAD

import java.util.*;

public class PrintString {
    public static void main(String args[]) {
        String name = "Tony";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        String Lastname = sc.nextLine();

        // concatenation
        String FullName = FirstName + " " + Lastname;
        System.out.println(FullName);

        // calculate length of string
        System.out.println(FullName.length());

        // dispay the character of string
        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }

        // compare two string using equals method
        if (FirstName.equals(Lastname)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // compare String using == operator
        if (FirstName == Lastname) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not Equal");
        }

        // compare String by creating new string
        if (new String("Pratiksha") == new String("Pratiksha")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not Equal");
        }

        // substring

        System.out.println(FirstName.substring(0, 6));
        System.out.println(FirstName.substring(6));

    }

}
=======

import java.util.*;

public class PrintString {
    public static void main(String args[]) {
        String name = "Tony";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        String Lastname = sc.nextLine();

        // concatenation
        String FullName = FirstName + " " + Lastname;
        System.out.println(FullName);

        // calculate length of string
        System.out.println(FullName.length());

        // dispay the character of string
        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }

        // compare two string using equals method
        if (FirstName.equals(Lastname)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // compare String using == operator
        if (FirstName == Lastname) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not Equal");
        }

        // compare String by creating new string
        if (new String("Pratiksha") == new String("Pratiksha")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not Equal");
        }

        // substring

        System.out.println(FirstName.substring(0, 6));
        System.out.println(FirstName.substring(6));

    }

}
>>>>>>> daef9b2f1e20034072a681336d241ea15c5e10ec
