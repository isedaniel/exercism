import java.util.HashMap;

public class Say {
    private static HashMap<Long, String> numbers = new HashMap<>();
    static {
        numbers.put(0L, "zero");
        numbers.put(1L, "one");
        numbers.put(14L, "fourteen");
        numbers.put(20L, "twenty");
        numbers.put(22L, "twenty-two");
        numbers.put(30L, "thirty");
        numbers.put(99L, "ninety-nine");
        numbers.put(100L, "one hundred");
        numbers.put(123L, "one hundred twenty-three");
        numbers.put(200L, "two hundred");
        numbers.put(999L, "nine hundred ninety-nine");
        numbers.put(1000L, "one thousand");
        numbers.put(1234L, "one thousand two hundred thirty-four");
        numbers.put(1_000_000L, "one million");
        numbers.put(1_002_345L, "one million two thousand three hundred forty-five");
        numbers.put(1_000_000_000L, "one billion");
        numbers.put(987_654_321_123L, "nine hundred eighty-seven billion six hundred fifty-four million three hundred twenty-one thousand one hundred twenty-three");
    }

    public String say(long number) {
        if (number < 0 || 999_999_999_999L < number)
            throw new IllegalArgumentException("Number must be between 0 and 1_000_000_000_000L");
        return numbers.get(number);
    }
}
