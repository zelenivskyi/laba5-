import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {
    public static void execute(List<Double> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}