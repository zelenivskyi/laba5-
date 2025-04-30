import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void execute(List<Integer> numbers) {
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
    }
}