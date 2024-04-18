class SqueakyClean {
    static String clean(String identifier) {
        String cleaned = "";
        boolean upper = false;
        for (int i=0; i < identifier.length(); i++){
            char c = identifier.charAt(i);
            if (c == ' ') 
                cleaned += '_';
            else if (Character.isDigit(c)) {
                if (c == '0')
                    cleaned += 'o';
                else if (c == '1')
                    cleaned += 'l';
                else if (c == '3')
                    cleaned += 'e';
                else if (c == '4')
                    cleaned += 'a';
                else if (c == '7')
                    cleaned += 't';
            }
            else if (c == '-') 
                upper = true;
            else if (upper) {
                upper = false; 
                cleaned += Character.toUpperCase(c);
            }
            else if (Character.isLetter(c)) 
                cleaned += c;
        }
        return cleaned;
    }
}
