import java.util.stream.IntStream;

class NaturalNumber {
    Classification classification;

    NaturalNumber(int number) {
        if (number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        int aliquot = IntStream.rangeClosed(1, number /2)
            .parallel()
            .filter(i -> number % i == 0)
            .sum();

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
