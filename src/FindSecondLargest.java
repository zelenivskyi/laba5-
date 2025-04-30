import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargest {
    public static void execute(List<Integer> numbers) {
        Optional<Integer> secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondLargest.ifPresent(n -> System.out.println("Second largest: " + n));
    }
}