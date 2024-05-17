import java.util.Arrays;

class Matrix {
    private int[][] matrix;

    Matrix(String stringMatrix) {
        this.matrix = Arrays.stream(stringMatrix.split("\n"))
            .map(row -> Arrays.stream(row.split(" "))
                    .mapToInt(Integer::parseInt).toArray())
            .toArray(int[][]::new);
    }

    int[] getRow(int row) {
        return matrix[row - 1];
    }

    int[] getColumn(int column) {
        return Arrays.stream(matrix)
            .mapToInt(row -> row[column - 1])
            .toArray();
    }
}
