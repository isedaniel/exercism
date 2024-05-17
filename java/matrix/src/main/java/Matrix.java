import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Matrix {
    private List<List<Integer>> rows = new ArrayList<>();
    private List<List<Integer>> columns = new ArrayList<>();

    Matrix(String stringMatrix) {
        for (String stringRow : stringMatrix.split("\n")) {
            List<Integer> row = new ArrayList<>(Arrays.asList(stringRow.split(" ")))
                .stream()
                .map(v -> Integer.parseInt(v))
                .toList();

            this.rows.add(row);
        }

        for (int i=0; i<this.rows.get(0).size(); i++) {
            List<Integer> column = new ArrayList<>();
            for (int j=0; j<this.rows.size(); j++) {
                
                column.add(this.rows.get(j).get(i));
            }
            this.columns.add(column);
        }
    }

    int[] getRow(int row) {
        return this.rows.get(row - 1).stream().mapToInt(Integer::intValue).toArray();
    }

    int[] getColumn(int column) {
        return this.columns.get(column - 1).stream().mapToInt(Integer::intValue).toArray();
    }
}
