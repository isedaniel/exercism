import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Sieve {
    private final List<Integer> primes;

    Sieve(int max) {
        if (max < 2) {
            primes = new ArrayList<>();
            return;
        }

        boolean[] isPrime = new boolean[max + 1];

        isPrime[2] = true;
        for (int i=3; i<isPrime.length; i += 2) isPrime[i] = true;
        
        for (int i=3; i*i<=max; i+=2) {
            if (isPrime[i]) {
                for (int j=i*i; j<=max; j+=i) {
                    isPrime[j] = false;
                }
            };
        }

        primes = IntStream.range(0, max+1)
            .filter(i -> isPrime[i])
            .boxed()
            .toList();
    }

    List<Integer> getPrimes() {
        return this.primes;
    }
}
