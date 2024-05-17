class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1)
            throw new IllegalArgumentException();

        // return the only even prime
        if (nth == 1)
            return 2;

        // to test only odd numbers
        int n = 3;
        int primes = 2;
        while (primes<nth) {
            n += 2;
            if (isPrime(n)) primes++; 
        }
        return n;
    }

    boolean isPrime(int n) {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
