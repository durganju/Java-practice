import java.util.List;

public class Stream01_Corrected {

    public static List<String> getPlaces() {

        return List.of(
                "Nepal, Kathmandu",
                "Nepal, Pokhara",
                "India, Delhi",
                "USA, New York",
                "Africa, Nigeria"
        );
    }
    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal (filtered, mapped, and sorted):");

        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(p -> p.toUpperCase())
                .sorted()
                .forEach(p -> System.out.println(p));
    }
}