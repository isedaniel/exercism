import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> letters = new HashSet<Character>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c))
            letters.add(Character.toLowerCase(c));
        }
        return letters.size() == 26;

        
    }

}
