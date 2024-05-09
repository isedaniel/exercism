import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char c) {
        int size = 2 * (c - 'A') + 1;

        List<String> diamond = new ArrayList<>();
        for (int i = 0; i < size / 2 + 1; i++) {
            diamond.add(i, getRow((char) ('A' + i), size));
            diamond.add(i, getRow((char) ('A' + i), size));
        }
        diamond.remove(size / 2);

        return diamond;
    }

    String getRow(char c, int size) {
        int offset = c - 'A';
        int lIndex = size / 2 - offset;
        int rIndex = size / 2 + offset;

        char[] row = new char[size];
        Arrays.fill(row, ' ');
        row[lIndex] = c;
        row[rIndex] = c;

        return new String(row);
    }

}
