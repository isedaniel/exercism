import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Sieve {
    private boolean[] isPrime;
    private List<Integer> primes;

    Sieve(int max) {
        if (max < 2) {
            primes = new ArrayList<>();
            return;
        }

        isPrime = new boolean[max - 1];
        Arrays.fill(isPrime, true);

        for (int i=2; i <= Math.sqrt(max); i++) {
            for (int j=i*i; j < max; j+=i) {
                isPrime[j] = false;
            }
        }

        primes = IntStream.range(2, max)
            .filter(i -> isPrime[i])
            .boxed()
            .toList();
    }

    List<Integer> getPrimes() {
        return this.primes;
    }
}
