import java.util.Arrays;

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
            int[] scores = new int[6];
            int sum = 0;
            for (int i=1; i<=6; i++) {
                scores[i-1] = count(dice, i);
                sum += count(dice, i) * i;
            }
            Arrays.sort(scores);
            this.score = (scores[5] == 3 && scores[4] == 2) ? sum : 0;
        }
        else if (yachtCategory == YachtCategory.FOUR_OF_A_KIND) {
            int[] scores = new int[6];
            int sum = 0;
            for (int i=1; i<=6; i++) {
                scores[i-1] = count(dice, i);
                if (count(dice, i) >= 4) sum += i * 4;
            }
            Arrays.sort(scores);
            this.score = (scores[5] >= 4) ? sum : 0;
        }
        else if (yachtCategory == YachtCategory.LITTLE_STRAIGHT) {
            Arrays.sort(dice);
            int[] straight = new int[]{1, 2, 3, 4, 5};
            this.score = (Arrays.equals(dice, straight)) ? 30 : 0;
        }
        else if (yachtCategory == YachtCategory.BIG_STRAIGHT) {
            Arrays.sort(dice);
            int[] straight = new int[]{2, 3, 4, 5, 6};
            this.score = (Arrays.equals(dice, straight)) ? 30 : 0;
        }
        else {
            int sum = 0;
            for (int d : dice) {
                this.score += d;
            }
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
