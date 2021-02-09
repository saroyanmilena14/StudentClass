package matrixAll.Arrays.MatrixAll;
// ex.2  printing columns from up to down
public class Arrays {
    public static void main(String[] args) {

        int matrix[][] = new int[][]{
                {8, 75, 21, 23}, // i=0
                {17, 82, 61, 5}, // i=1
                {71, 8, 28, 31}, // i=2
                {12, 47, 32, 3} ,// i
                {34,5, 6, 7 }
        };
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i <matrix.length; i++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
