public class Exception003 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong."+ myNumbers[2]);
        } finally {
            System.out.println("I'm from finally block.");
        }
    }
}