package StringHandling;

public class Task015 {
    public static void main(String[] args) {
        String str1 = "Java Strings ";
        String str2 = new String(str1);
        String str3 = new String("are easy to learn ");

        char ch[] = {'S', 't', 'r', 'n', 'g'};
        String str4 = new String(ch);

        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
    }
}
