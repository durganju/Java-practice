package java_tasks.exceptions;

public class Exception004_1  {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]); // Accessing 2nd index
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("I'm from finally block.");
        }
    }
}
