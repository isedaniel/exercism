class IsbnVerifier {

    boolean isValid(String isbn) {
        isbn = isbn.replace("-", "");

        if (isbn.length() != 10) return false;

        int sum = 0;
        for (int i=0; i<10; i++) {
            char c = isbn.charAt(i);
            if (Character.isDigit(c)) {
                sum += (c - '0') * (10 - i);
            }
            else if (i == 9 && c == 'X') {
                sum += 10;
            }
            else {
                return false;
            }
        }

        return (sum % 11) == 0;
    }

}
