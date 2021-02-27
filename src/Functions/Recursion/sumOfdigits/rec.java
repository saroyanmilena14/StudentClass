package Functions.Recursion.sumOfdigits;

public class rec {

    public static void main (String args[]) {
        System.out.println(SumOfDigits(453));

    }


    static int SumOfDigits (int Num) {
        int sum=0;
        if(Num>0) {
            sum=Num%10+SumOfDigits(Num/10);
        }
        return sum;

    }
}
