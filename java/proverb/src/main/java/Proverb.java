class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";

        StringBuilder proverb = new StringBuilder();
        for (int i=1; i<words.length; i++) {
            proverb.append(
                "For want of a " 
                + words[i - 1]
                + " the "
                + words[i]
                + " was lost.\n");
        }

        return proverb.toString() 
            + "And all for the want of a "
            + words[0]
            + ".";
    }

}
