class TwelveDays {
    final String[] song = {
        "a Partridge in a Pear Tree.\n",
        "two Turtle Doves, and ",
        "three French Hens, ",
        "four Calling Birds, ",
        "five Gold Rings, ",
        "six Geese-a-Laying, ",
        "seven Swans-a-Swimming, ",
        "eight Maids-a-Milking, ",
        "nine Ladies Dancing, ",
        "ten Lords-a-Leaping, ",
        "eleven Pipers Piping, ",
        "twelve Drummers Drumming, ",
    };

    final String[] day = {
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth",
    };

    String verse(int number) {
        StringBuilder sb = new StringBuilder();

        sb.append(firstVerse(number));

        for (int i=number - 1; i>=0; i--) {
            sb.append(song[i]);
        }

        return sb.toString();
    }

    String verses(int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i=start; i<=end; i++) {
            sb.append(verse(i));
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }

    private String firstVerse(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append("On the ");
        sb.append(day[number - 1]);
        sb.append(" day of Christmas my true love gave to me: ");

        return sb.toString();
    }
}
