class LuhnValidator {

    boolean isValid(String number) {
        number = new StringBuilder(number)
            .reverse()
            .toString()
            .replace(" ", "");

        if (!number.matches("[0-9]+") || number.equals("0"))
            return false;

        boolean even = false;
        int sum = 0;
        for (char c : number.toCharArray()) {
            int n = Character.getNumericValue(c);

            if (even) {
                n = (n*2 > 9) ? (n*2 - 9) : (n*2);
            }
            even = !even;

            sum += n;
        }
        return (sum % 10 == 0);
    }

}
