class Atbash {

    String encode(String input) {
        input = input.toLowerCase();

        var count = 0;
        var sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                sb.append((char) ('a' + 'z' - c));
                count++;
            } else if ('1' <= c && c <= '9') {
                sb.append(c);
                count++;
            }

            if (count == 5) {
                sb.append(' ');
                count = 0;
            }
        }
        return sb.toString().trim();
    }

    String decode(String input) {
        input = input.toLowerCase();

        var sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ('a' <= c && c <= 'z')
                sb.append((char) ('a' + 'z' - c));
            else if ('1' <= c && c <= '9') 
                sb.append(c);
        }
        return sb.toString();
    }

}
