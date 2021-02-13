public class Digits_ofNum {

    public static void main(String args[]) {
        int num= 3457890;
        int count=0;
        int digit=0;
        int num1=num;
        while(num>0)
         {
            num=num/10;
            count++;
         }
        while(num1>0) {
            digit=num1%10;
            System.out.println(digit);
            num1=num1/10;
            count--;
        }

    }
}
