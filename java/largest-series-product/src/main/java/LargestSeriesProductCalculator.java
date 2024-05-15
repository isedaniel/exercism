
class LargestSeriesProductCalculator {
    final private String number;

    LargestSeriesProductCalculator(String number) {
        if (!number.chars().allMatch(Character::isDigit))
            throw new IllegalArgumentException("String to search may only contain digits.");

        this.number = number;
    }

    long calculateLargestProductForSeriesLength(int span) {
        if (span > this.number.length()) 
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        if (span < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        long max = 0;
        for (int i=0; (i + span) <= this.number.length(); i++) {
            char[] series = number.substring(i, i+span).toCharArray();

            long number = 1;
            for (char c : series) {
                number *= Character.getNumericValue(c);
            }

            if (number > max) max = number;
        }
        return max;
    }
}
