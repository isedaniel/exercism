import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        return phrase.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .allMatch(new HashSet<>()::add);
    }

}
