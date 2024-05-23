import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {
    private final int sum;

    SumOfMultiples(int max, int[] factors) {
        this.sum = IntStream.range(1, max)
            .filter(number -> Arrays.stream(factors)
                    .anyMatch(factor -> 
                        (factor > 0) && (number % factor == 0)))
            .sum();
    }

    int getSum() {
        return sum;
    }

}
