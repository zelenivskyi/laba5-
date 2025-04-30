import java.util.List;
import java.util.Optional;

public class FindFirstNonEmpty {
    public static void execute(List<String> strings) {
        Optional<String> firstNonEmpty = strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();
        firstNonEmpty.ifPresent(s -> System.out.println("First non-empty string: " + s));
    }
}