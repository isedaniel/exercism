class Bob {

    String hey(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return "Fine. Be that way!";
        }
        else if (yell(s) && question(s)) {
            return "Calm down, I know what I'm doing!";
        } else if (question(s)) {
            return "Sure.";
        } else if (yell(s)) {
            return "Whoa, chill out!";
        }
        return "Whatever.";
    }

    boolean yell(String s) {
        boolean hasLetter = s.matches(".*[a-zA-Z]+.*");
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return hasLetter;
    }

    boolean question(String s) {
        return s.charAt(s.length() - 1) == '?';
    }

}
