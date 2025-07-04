import java.util.LinkedList;
import java.util.List;

public class FullNameFriendsLinkedList {
    public static void main(String[] args) {
        List<String> firstNames = List.of(
                "tara",
                "lara",
                "dora",
                "kara",
                "dara"
        );
        List<String> lastNames = List.of("pa", "ba", "ma", "ka", "ta");
        List<String> fullNames = new LinkedList<>();
        for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i);
            String lastName = lastNames.get(i);
            String fullName = firstName + " " + lastName;
            fullNames.add(fullName);
        }
        System.out.println("My friends' full names are: " + fullNames);
    }
}