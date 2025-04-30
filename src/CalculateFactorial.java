import java.util.stream.IntStream;

public class CalculateFactorial {
    public static void execute(int number) {
        int factorial = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}