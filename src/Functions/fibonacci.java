package Functions;
//task 3-fibonacci
public class fibonacci {
    public static void main (String args []){
        fibonacci(1);

    }

    static void fibonacci(int n){
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);

        if(n>0) {
            for(int i=2; i<n; i++) {
               c=a+b;
                System.out.println(c);
               a=b;
               b=c;
            }
        }
            else {
            System.out.println("not a valid input");
        }
            return;
    }
}
