class RotationalCipher {
    private int key;

    RotationalCipher(int shiftKey) {
        this.key = shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            if ('a' <= c && c <= 'z')
                sb.append(Character.toChars(
                        (c - 'a' + this.key) % 26 + 'a'));
            else if ('A' <= c && c <= 'Z')
                sb.append(Character.toChars(
                        (c - 'A' + this.key) % 26 + 'A'));
            else
                sb.append(c);
        }
        return sb.toString();
    }

}
