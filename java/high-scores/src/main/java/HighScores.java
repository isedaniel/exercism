import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HighScores {
    private List<Integer> scores;
    private List<Integer> topThree;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;

        this.topThree = new ArrayList<Integer>(highScores);
        Collections.sort(topThree);
        Collections.reverse(topThree);
        this.topThree = topThree.subList(0, (topThree.size() > 2)? 3:topThree.size());
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(this.scores);
    }

    List<Integer> personalTopThree() {
        return topThree;
    }

}
