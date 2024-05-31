import java.util.Arrays;

class Yacht {
    private final int[] FULL_HOUSE_FREQ = new int[]{0,0,0,0,2,3};
    private int score;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        switch (yachtCategory) {
            case ONES:
                this.score = countAndSum(dice, 1);
                break;
            case TWOS:
                this.score = countAndSum(dice, 2);
                break;
            case THREES:
                this.score = countAndSum(dice, 3);
                break;
            case FOURS:
                this.score = countAndSum(dice, 4);
                break;
            case FIVES:
                this.score = countAndSum(dice, 5);
                break;
            case SIXES:
                this.score = countAndSum(dice, 6);
                break;
            case FULL_HOUSE:
                int[] counted = count(dice);
                Arrays.sort(counted);
                this.score = (Arrays.equals(counted, FULL_HOUSE_FREQ))? 
                    Arrays.stream(dice).sum() : 0;
                break;
            case FOUR_OF_A_KIND:
                int[] four = count(dice);
                Arrays.sort(dice);
                this.score = (Arrays.stream(four)
                        .anyMatch(n -> n>=4)) ?
                    dice[2] * 4 : 0;
                break;
            case LITTLE_STRAIGHT:
                this.score = (Arrays.stream(dice).sum() == 15)? 30: 0;
                break;
            case BIG_STRAIGHT:
                this.score = (Arrays.stream(dice).sum() == 20)? 30: 0;
                break;
            case YACHT:
                this.score = (Arrays.stream(dice).allMatch(n -> n==dice[0]))? 50: 0;
                break;
            default:
                this.score = Arrays.stream(dice).sum();
        }
    }

    int score() {
        return this.score;
    }

    private int countAndSum(int[] dice, int counted) {
        return Arrays.stream(dice)
            .filter(d -> d == counted)
            .sum();
    }

    private int[] count(int[] dice) {
        int[] counted = new int[6];
        Arrays.fill(counted, 0);
        Arrays.stream(dice)
            .forEach(d -> counted[d - 1]+=1);
        return counted;
    }
}
