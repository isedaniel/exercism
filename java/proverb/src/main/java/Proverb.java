class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";

        if (words.length == 1) 
            return "And all for the want of a "
                + words[0]
                + ".";

        String proverb = "";
        for (int i=1; i<words.length; i++) {
            proverb += "For want of a " 
                + words[i - 1]
                + " the "
                + words[i]
                + " was lost.\n";
        }
        return proverb 
            + "And all for the want of a "
            + words[0]
            + ".";
    }

}
