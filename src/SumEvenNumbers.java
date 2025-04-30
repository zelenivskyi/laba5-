import java.util.List;

public class SumEvenNumbers {
    public static void execute(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sum);
    }
}