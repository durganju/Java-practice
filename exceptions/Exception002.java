package java_tasks.exceptions;

public class Exception002 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}

