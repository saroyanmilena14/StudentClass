package Functions;
//task 4-missing number
public class missingNum {

    public static void main (String args[]) {
        int array []= {1, 2, 3, 4, 5,6, 8,9,10};
        System.out.println(MissingNum(array));

    }



    static int MissingNum (int arr[]) {
        int missingNumber=0;
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i + 1] - arr[i]) != 1) {
                arr[i]++;
                missingNumber=arr[i];
            }
        }
        return missingNumber;
    }
}
