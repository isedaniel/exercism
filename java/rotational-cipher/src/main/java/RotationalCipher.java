import java.util.stream.Collectors;

class RotationalCipher {
    private int key;

    RotationalCipher(int shiftKey) {
        this.key = shiftKey;
    }

    String rotate(String data) {
        return data.chars()
            .map(this::rotate)
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append)
            .toString();
    }

    private Character rotate(int ch) {
        if (Character.isAlphabetic(ch)) {
            char index = Character.isUpperCase(ch) ? 'A' : 'a';
            ch = (ch - index + this.key) % 26 + index;
        }
        return (char) ch;
    }
}
