import java.util.HashSet;
import java.util.Set;

class NaturalNumber {
    Classification classification;

    NaturalNumber(int number) {
        if (number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        Set<Integer> factors = new HashSet<>();
        int step = (number % 2 == 0) ? 1 : 2;
        for (int i=1; i<=Math.sqrt(number); i+=step){
            if (number % i == 0) {
                factors.add(i);
                factors.add(number / i);
            }
        }

        int aliquot = factors.stream().mapToInt(Integer::intValue).sum() - number;

        if (aliquot < number) 
            this.classification = Classification.DEFICIENT;
        else if (aliquot > number)
            this.classification = Classification.ABUNDANT;
        else
            this.classification = Classification.PERFECT;
    }

    Classification getClassification() {
        return this.classification;
    }
}
