package matrixAll.Arrays.Snake;

public class Arrays {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{
                {8, 75, 21, 23},
                {17, 82, 61, 5},
                {71, 8, 28, 31},
                {12, 47, 32, 3},

        };
        int i;
        int j;


             for(i=0,j=0; j<matrix[0].length; j++) {
                 System.out.println(matrix[i][j]);
             }
             for(j=matrix[0].length-1, i=1; i<matrix.length; i++){
                 System.out.println(matrix[i][j]);
             }

             for(i=matrix.length-1, j=matrix[0].length-2; j>=0; j--) {
                 System.out.println(matrix[i][j]);
             }
             for(j=0, i=matrix.length-2;i>=matrix.length-3; i--) {
                 System.out.println(matrix[i][j]);
             }
              for(i=1, j=matrix[0].length-3; j<=matrix[0].length-2; j++) {
                  System.out.println(matrix[i][j]);
              }
              for(i=2, j=matrix[0].length-2; j>=matrix[0].length-3; j--) {
                  System.out.println(matrix[i][j]);
              }
         }

    }
