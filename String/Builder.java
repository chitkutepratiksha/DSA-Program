
public class Builder {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0 or 1
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(2));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert the char at index 0
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the char at index 0
        sb.delete(2, 4);
        System.out.println(sb);

        // append the

        sb.append('y');
        System.out.println(sb);

    }

}
