class ArmstrongNumbers {

    boolean isArmstrongNumber(int number) {
        int sum = 0;
        int digits = (int) Math.log10(number) + 1;
        for (int i=1,n=number; i<=digits; i++){
            sum += (int)Math.pow(n % (10*i), digits);
            n -= n % (10*i);
        }
        return sum == number;
    }

    int intArmstrongNumber(int number) {
        int sum = 0;
        int digits = (int) Math.log10(number) + 1;
        for (int i=1,n=number; i<=digits; i++){
            sum += (int)Math.pow(n % (10*i), digits);
            n -= n % (10*i);
        }
        return sum;
    }
}
