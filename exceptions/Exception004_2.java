package java_tasks.exceptions;

public class Exception004_2 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[3]); // Accessing 3rd index
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("I'm from finally block.");
        }
    }
}
