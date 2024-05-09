import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        for (int i=0; i<=a-'A'; i++) {
            diamond.add(getRow((char) ('A' + i), a));
        }
        for (int i=1; i<=a-'A'; i++) {
            diamond.add(getRow((char)(a - i), a));
        }
        return diamond;
    }

    private static String getRow(char c, char diamond) {
        StringBuilder row = new StringBuilder();
        if (c == 'A') {
            row.append(repeat(' ', diamond - c));
            row.append(c);
            row.append(repeat(' ', diamond - c));
        }
        else {
            row.append(repeat(' ', diamond - c));
            row.append(c);
            row.append(repeat(' ', 2 * (c - 'B') + 1));
            row.append(c);
            row.append(repeat(' ', diamond - c));
        }
        return row.toString();
    }

    private static String repeat(char c, int count) {
        if (count == 0)
            return "";
        return new String(new char[count]).replace('\0', c);
    }

}
