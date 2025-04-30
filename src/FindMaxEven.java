import java.util.List;
import java.util.Optional;

public class FindMaxEven {
    public static void execute(List<Integer> numbers) {
        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare);
        maxEven.ifPresent(n -> System.out.println("Max even number: " + n));
    }
}