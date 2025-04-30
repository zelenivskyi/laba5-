import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        List<String> stringList = Arrays.asList("Apple", "banana", "Cherry", "", "Date");
        String sentence = "Hello world from Java";

        FilterOddNumbers.execute(intList);
        FindAverage.execute(doubleList);
        SortStringsAlphabetically.execute(stringList);
        SumEvenNumbers.execute(intList);
        CalculateFactorial.execute(5);
        MultiplyAndSum.execute(intList);
        SquareNumbers.execute(intList);
        SortByLength.execute(stringList);
        CountWords.execute(sentence);
        FindFirstNonEmpty.execute(stringList);
        AllStartWithUppercase.execute(stringList);
        FindSecondLargest.execute(intList);
        FindMaxEven.execute(intList);
    }
}
