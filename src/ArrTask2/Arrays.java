package ArrTask2;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = {6, -5, 9, -3, 23, 8, 9};
         int i;
         int repeatNumsCount=0;
         for (i=1; (i< arr.length); i++) {
             if (arr[i] == arr[0]) {
             repeatNumsCount++;
             continue;
         }   }
             System.out.println("first reapts " + " " + repeatNumsCount + " "  + "times") ;
    }
    }

