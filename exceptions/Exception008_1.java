package java_tasks.exceptions;

 // Create the custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class to use the exception
public class Exception008_1 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible!");
        } else {
            System.out.println("Age is valid. You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(19); // Try changing this to 20 to test valid age
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception:");
            System.out.println(e.getMessage());
        }
    }
}
