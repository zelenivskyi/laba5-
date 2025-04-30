import java.util.List;

public class AllStartWithUppercase {
    public static void execute(List<String> strings) {
        boolean allUppercase = strings.stream()
                .allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
        System.out.println("All start with uppercase: " + allUppercase);
    }
}