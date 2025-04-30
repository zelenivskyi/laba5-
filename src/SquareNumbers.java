import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void execute(List<Integer> numbers) {
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
    }
}