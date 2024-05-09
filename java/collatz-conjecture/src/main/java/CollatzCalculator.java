class CollatzCalculator {

    int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only positive integers are allowed");

        int steps = 0;
        while (start > 1) {
            if ((start & 1) == 1)
                start = 3 * start + 1;
            else
                start >>= 1;
            steps++;
        }
        return steps;
    }

}
