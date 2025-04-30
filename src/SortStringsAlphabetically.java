import java.util.List;
import java.util.stream.Collectors;

public class SortStringsAlphabetically {
    public static void execute(List<String> strings) {
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println("Sorted strings: " + sorted);
    }
}