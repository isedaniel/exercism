public class PangramChecker {
    private final static int LETTERS = 26;

    public boolean isPangram(String input) {
        return input.toLowerCase().chars()
            .filter(Character::isLetter)
            .distinct()
            .count() == LETTERS;
    }
}
