import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {
    private final int sum;

    SumOfMultiples(int max, int[] numbers) {
        this.sum = IntStream.range(1, max)
            .filter(number -> Arrays.stream(numbers)
                    .anyMatch(divisor -> 
                        (divisor > 0) && (number % divisor == 0)))
            .sum();
    }

    int getSum() {
        return sum;
    }

}
