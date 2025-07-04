import java.util.stream.IntStream;

public class l {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).limit(10).forEach(System.out::println);
    }
}