import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface StringReverser {
    String reverse(String str);
}
public class LambdaShowcase {

    public static void main(String[] args) {
        System.out.println("--- Task 1: Combining Friend Names using a Stream ---");
        demonstrateFriendListManipulation();
        System.out.println("\n--- Task 2: Reversing a String using a Lambda Function ---");
        demonstrateStringReversingWithLambda();
        System.out.println("\n--- Task 3: Squaring Numbers using a Stream ---");
        demonstrateNumberSquaringWithStreams();
        System.out.println("\n--- Task 4: Filtering Places using a Stream ---");
        demonstrateFilteringWithStreams();
    }
    public static void demonstrateFriendListManipulation() {
        List<String> firstNames = List.of("tara", "lara", "dora", "kara", "dara");
        List<String> lastNames = List.of("pa", "ba", "ma", "ka", "ta");

        List<String> fullNames = IntStream.range(0, firstNames.size())
                .mapToObj(i -> firstNames.get(i) + " " + lastNames.get(i))
                .collect(Collectors.toList());
        System.out.println("Original First Names: " + firstNames);
        System.out.println("Combined Full Names: " + fullNames);
    }
    public static void demonstrateStringReversingWithLambda() {
        StringReverser reverserFunction = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        String original = "Lambda";
        String reversed = reverserFunction.reverse(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
    public static void demonstrateNumberSquaringWithStreams() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("Their squares: " + squares);
    }
    public static void demonstrateFilteringWithStreams() {
        List<String> places = List.of(
                "Nepal, Kathmandu",
                "Nepal, Pokhara",
                "India, Delhi",
                "USA, New York"
        );
        List<String> nepaliPlaces = places.stream()
                .filter(p -> p.startsWith("Nepal"))
                .collect(Collectors.toList());
        System.out.println("All places: " + places);
        System.out.println("Filtered places from Nepal: " + nepaliPlaces);
    }
}