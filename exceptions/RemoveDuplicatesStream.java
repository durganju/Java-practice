import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesStream {

    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = List.of(1, 2, 3, 2, 4, 5, 1, 6, 3, 7, 5);
        System.out.println("Original list with duplicates: " + numbersWithDuplicates);

        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List with duplicates removed:  " + uniqueNumbers);
    }
}