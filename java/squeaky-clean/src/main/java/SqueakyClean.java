import static java.util.Map.entry;

class SqueakyClean {
    public static Map<Integer, Character> leet = Map.ofEntries(
            entry(0, 'o'),
            entry(),
    );

    static String clean(String identifier) {
        String cleaned = "";
        boolean upper = false;
        for (int i=0;i < identifier.length(); i++){
            char c= identifier.charAt(i);
            if (c == ' ') { cleaned += '_'; }
            else if (Character.isDigit(c)) {}
            else if (c == '-') { upper = true; }
            else if (upper) { upper = false; cleaned += Character.toUpperCase(c); }
            else { cleaned += c; }
        }
        return cleaned;
    }
}
