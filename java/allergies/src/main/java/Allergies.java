import java.util.Arrays;
import java.util.List;

class Allergies {
    private final int score;

    Allergies(int score) {
        this.score = score;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & this.score) > 0;
    }

    List<Allergen> getList() {
        return Arrays.asList(Allergen.values())
            .stream()
            .filter(this::isAllergicTo)
            .toList();
    }
}
