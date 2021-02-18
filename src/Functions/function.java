package Functions;

public class function {

    public static void main(String args[]) {
         int [] arr={3, 56, 7, 89, 34};
        System.out.println(AverageOfArr(arr));
    }



    static double AverageOfArr (int array[] ) {

        int sum=0;
        double average=0;
        for(int i=0; i< array.length; i++) {
            sum+=array[i];
        }
         average=sum*1.0/array.length;

          return average;
    }
}