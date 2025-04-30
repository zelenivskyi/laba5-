import java.util.Arrays;

public class CountWords {
    public static void execute(String sentence) {
        long count = Arrays.stream(sentence.split(" "))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Word count: " + count);
    }
}