import java.util.HashMap;

class Scrabble {
    private static HashMap<Character, Integer> letters = new HashMap<>();
    static {
        letters.put('a', 1);
        letters.put('b', 3);
        letters.put('c', 3);
        letters.put('d', 2);
        letters.put('e', 1);
        letters.put('f', 4);
        letters.put('g', 2);
        letters.put('h', 4);
        letters.put('i', 1);
        letters.put('j', 8);
        letters.put('k', 5);
        letters.put('l', 1);
        letters.put('m', 3);
        letters.put('n', 1);
        letters.put('o', 1);
        letters.put('p', 3);
        letters.put('q', 10);
        letters.put('r', 1);
        letters.put('s', 1);
        letters.put('t', 1);
        letters.put('u', 1);
        letters.put('v', 4);
        letters.put('w', 4);
        letters.put('x', 8);
        letters.put('y', 4);
        letters.put('z', 10);
    }

    private int score;


    Scrabble(String word) {
        for (char letter : word.toLowerCase().toCharArray()) {
            this.score += letters.get(letter);
        }
    }

    int getScore() {
        return score;
    }

}
