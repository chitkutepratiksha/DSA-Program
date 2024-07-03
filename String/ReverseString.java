public class ReverseString {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");

        // /2 for reverse the half string automatically half string will reverse
        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            // finding the char at front and back index

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // replace firstchar with back and back with firstchar

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

    }

}
