import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void execute(List<String> strings) {
        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted by length: " + sorted);
    }
}