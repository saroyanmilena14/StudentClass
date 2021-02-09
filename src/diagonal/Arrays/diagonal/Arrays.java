package diagonal.Arrays.diagonal;
//ex1 . printing the  2nd diagonal
public class Arrays {

    public static void main(String[] args) {

        int matrix[][] = new int[][] {
                {8,75,21,23}, // i=0
                {17,82,61,5}, // i=1
                {71,8,28,31}, // i=2
                {12,47,32,3} // i=3
        };
        int i;
        int j;
        for ( i=0, j=matrix[0].length-1 ;  i< matrix.length && j>=0;  i++, j--) {
            System.out.println(matrix[i][j] + " ");
        }
    }

}
