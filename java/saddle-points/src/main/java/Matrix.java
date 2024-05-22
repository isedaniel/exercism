import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    final Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    Matrix(List<List<Integer>> values) {
        if (values.isEmpty()) {
            return; 
        }

        Set<MatrixCoordinate> maxInRow = new HashSet<>();
        for (int rowIndex=0; rowIndex<values.size(); rowIndex++) {
            maxInRow.addAll(getMaxInRow(values.get(rowIndex), rowIndex));
        }

        Set<MatrixCoordinate> minInCol = new HashSet<>();
        for (int i=0; i<values.get(0).size(); i++) {
            minInCol.addAll(getMinInCol(
                        getColumn(values, i),
                        i));
        }

        saddlePoints.addAll(maxInRow);
        saddlePoints.retainAll(minInCol);
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;
    }

    private static Set<MatrixCoordinate> getMaxInRow(List<Integer> row, int rowIndex) {
        int max = Collections.max(row);

        Set<MatrixCoordinate> coords = new HashSet<>();
        for (int i=0; i<row.size(); i++) {
            if (row.get(i) == max) coords.add(
                    new MatrixCoordinate(rowIndex + 1, i + 1));
        }

        return coords;
    }

    private static Set<MatrixCoordinate> getMinInCol(List<Integer> col, int colIndex) {
        int min = Collections.min(col);

        Set<MatrixCoordinate> coords = new HashSet<>();
        for (int i=0; i<col.size(); i++) {
            if (col.get(i) == min) coords.add(
                    new MatrixCoordinate(i+1, colIndex+1)); 
        }

        return coords;
    }

    private static List<Integer> getColumn(List<List<Integer>> matrix, int col) {
        return matrix.stream()
            .map(row -> row.get(col))
            .toList();
    }
}
