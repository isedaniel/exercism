class RotationalCipher {
    private int key;

    RotationalCipher(int shiftKey) {
        this.key = shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb = new StringBuilder();
        for (char ch : data.toCharArray()) {
            sb.append(rotate(ch));
        }
        return sb.toString();
    }

    private Character rotate(int ch) {
        if (Character.isAlphabetic(ch)) {
            char index = Character.isUpperCase(ch) ? 'A' : 'a';
            ch = (ch - index + this.key) % 26 + index;
        }
        return (char) ch;
    }
}
