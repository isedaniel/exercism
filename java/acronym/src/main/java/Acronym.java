import java.util.Arrays;
import java.util.List;

class Acronym {
    private String acronym;
    private List<Character> delimiters = Arrays.asList(' ', '-', '_');

    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        boolean record = true;
        for (char c : phrase.toCharArray()){
            if (record && !delimiters.contains(c)) {
                sb.append(c);
                record = false;
            }
            if (delimiters.contains(c)) {
                record = true;
            }
        }
        acronym = sb.toString().toUpperCase();
    }

    String get() {
        return this.acronym;
    }

}
