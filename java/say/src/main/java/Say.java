import java.util.HashMap;

public class Say {
    private static HashMap<Long, String> numbers = new HashMap<>();
    static {
        numbers.put(0L, "zero");
        numbers.put(1L, "one");
        numbers.put(14L, "fourteen");
        numbers.put(20L, "twenty");
    }

    public String say(long number) {
        StringBuilder numberName;

        while (number > 0) {
            long digit = number % 10;

        }
        return numbers.get(number);

    }
}
