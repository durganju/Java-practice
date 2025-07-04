import java.util.stream.IntStream;

public class list {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).skip(15).forEach(System.out::println);
    }
}