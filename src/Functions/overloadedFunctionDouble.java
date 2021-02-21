package Functions;

public class overloadedFunctionDouble {
    public static void main (String args[]) {

       double arr[] = {3.4 , 5.6, 7.8, 4.9 , 56.2};
        System.out.println(add(arr));
    }



    static int add (double arr[]) {
        double sum=0;
        int result=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
            result = (int)sum;
        }
        return result;
    }
}
