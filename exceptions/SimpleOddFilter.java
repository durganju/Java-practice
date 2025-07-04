import java.util.ArrayList;
import java.util.List;

public class SimpleOddFilter {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original list: " + numbers);

        numbers.removeIf(num -> num % 2 == 0);

        System.out.println("List after removing even numbers: " + numbers);
    }
}