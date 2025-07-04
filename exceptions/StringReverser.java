public class StringReverser {

    public static void main(String[] args) {
        String originalString = "Hello World";
        String reversedString = reverseWithStringBuilder(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}