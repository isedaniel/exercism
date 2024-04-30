class ResistorColorTrio {
    enum Colors {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }

    String label(String[] colors) {
        long resistance = (Colors.valueOf(colors[0]).ordinal() * 10 +
            Colors.valueOf(colors[1]).ordinal()) *
            (long) Math.pow(10, Colors.valueOf(colors[2]).ordinal());

        if (resistance > 1_000_000_000) {
            return (resistance /= 1_000_000_000) + " gigaohms";
        }
        else if (resistance > 1_000_000) {
            return (resistance /= 1_000_000) + " megaohms";
        }
        else if (resistance > 1000) {
            return (resistance /= 1_000) + " kiloohms";
        }

        return resistance + " ohms";
    }
}
