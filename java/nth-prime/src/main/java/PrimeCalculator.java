class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1)
            throw new IllegalArgumentException();

        int n = 2;
        int primes = 1;
        while (primes<nth) {
            n++;
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
