class ArmstrongNumbers {

    boolean isArmstrongNumber(int number) {
        char[] numbers = Integer.toString(number).toCharArray();
        int size = numbers.length;
        int armstrong = 0;
        for (var n : numbers) {
            armstrong += Math.pow(Character.getNumericValue(n), size);
        }
        return armstrong == number;
    }

}
