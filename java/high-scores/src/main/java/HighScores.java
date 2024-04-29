import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
    private List<Integer> scores;
    private Integer best;
    private List<Integer> topThree;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
        this.best = highScores
            .stream()
            .max(Integer::compareTo)
            .get();
        this.topThree = highScores
            .stream()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .collect(Collectors.toList());
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        return this.best;
    }

    List<Integer> personalTopThree() {
        return this.topThree;
    }

}
