import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(test("J"));
        System.out.println(test("f"));
        System.out.println(test("a"));
    }

    /**
     * Use java.time.Month.values() and stream API with next requirement to return list of integers:
     * 1. integers represent name lengths of months;
     * 2. only use months whose name contains 'substring' parameter;
     * 3. do not need to have duplicates in result list.
     * For example, function call with "J" param will return [7, 4], because JANUARY has 7 letter, JUNE and JULY have 4 letters.
     */
    public static List<Integer> test(String substring) {
        return Arrays.stream(Month.values())
                .map(Month::name)
                .filter(name -> name.contains(substring.toUpperCase()))
                .map(name -> name.length())
                .distinct()
                .collect(Collectors.toList());
    }
}
