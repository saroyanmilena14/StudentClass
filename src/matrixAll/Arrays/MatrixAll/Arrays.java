package matrixAll.Arrays.MatrixAll;
// ex.2  printing rows from up to down
public class Arrays {
    public static void main(String[] args) {

        int matrix[][] = new int[][]{
                {8, 75, 21, 23}, // i=0
                {17, 82, 61, 5}, // i=1
                {71, 8, 28, 31}, // i=2
                {12, 47, 32, 3} // i=3
        };
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
