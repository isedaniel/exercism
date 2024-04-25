class ArmstrongNumbers {
    boolean isArmstrongNumber(int number) {
        int sum = 0;
        int digits = (int) Math.log10(number) + 1;
        for (int i=0, n=number; i < digits; i++){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        return sum == number;
    }
}
