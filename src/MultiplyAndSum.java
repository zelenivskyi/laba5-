import java.util.List;

public class MultiplyAndSum {
    public static void execute(List<Integer> numbers) {
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Product: " + product + ", Sum: " + sum);
    }
}