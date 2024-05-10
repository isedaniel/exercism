import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char c) {
        int size = 2 * (c - 'A') + 1;

        // create the diamond
        List<String> diamond = new ArrayList<>();
        for (int i = 0; i < size / 2; i++) {
            diamond.add(i, getRow((char) ('A' + i), size));
            diamond.add(i, getRow((char) ('A' + i), size));
        }

        // add central row
        diamond.add(size / 2, getRow(c, size));

        return diamond;
    }

    // return row of desired size with char in place
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
