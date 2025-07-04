import java.util.List;

public class SimpleStreamSquares {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 8, 10, 12);
        System.out.println("Original numbers: " + numbers);
        System.out.println("Displaying the square of each number:");
        numbers.stream()
                .map(num -> num * num)
                .forEach(System.out::println);
    }
}