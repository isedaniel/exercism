import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase == "") return true;

        phrase = phrase.replace("-", "")
            .replace(" ", "").toLowerCase();

        Set<String> letters = new HashSet<String>();
        Collections.addAll(letters, phrase.split(""));

        return (letters.size() == phrase.length());
    }

}
