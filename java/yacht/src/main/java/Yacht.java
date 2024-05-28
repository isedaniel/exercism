class Yacht {
    private int score;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        if (yachtCategory == YachtCategory.YACHT) {
            this.score = yacht(dice);
        }
        else if (yachtCategory == YachtCategory.ONES) {
            this.score = count(dice, 1);
        }
        else if (yachtCategory == YachtCategory.TWOS) {
            this.score = count(dice, 2) * 2;
        }
        else if (yachtCategory == YachtCategory.THREES) {
            this.score = count(dice, 3) * 3;
        }
        else if (yachtCategory == YachtCategory.FOURS) {
            this.score = count(dice, 4) * 4;
        }
        else if (yachtCategory == YachtCategory.FIVES) {
            this.score = count(dice, 5) * 5;
        }
        else if (yachtCategory == YachtCategory.SIXES) {
            this.score = count(dice, 6) * 6;
        }
        else if (yachtCategory == YachtCategory.FULL_HOUSE) {
            this.score = (count(dice, 1) +
                count(dice, 2) +
                count(dice, 3) +
                count(dice, 4) +
                count(dice, 5) +
                count(dice, 6) == 5);
        }
    }

    int score() {
        return this.score;
    }

    private int yacht(int[] dice) {
        int first = dice[0];

        int count = 0;
        for (int d : dice) {
            if (d == first) count++;
        }

        return (count == 5) ? 50: 0;
    }

    private int count(int[] dice, int counted) {
        int count = 0;
        for (int d : dice) {
            if (d == counted) count++;
        }

        return count;
    }
}
