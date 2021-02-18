import org.w3c.dom.ls.LSOutput;

public class function {

    public static void main(String args[]) {
//
//        int[] arr1 = {5, 6, 7, 4, 3, 8, 9, 23};
//        int[] arr2 = {4, 5, 6, 3, 23, 45, 67};
//
//        System.out.println(Max(arr2));
//        int max1 = Max(arr1);
        System.out.println(isPrime(9));
    }

//
//    static int Max(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return  false;
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}



