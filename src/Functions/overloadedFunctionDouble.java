package Functions;

public class overloadedFunctionDouble<sum> {
    public static void main(String args[]) {

        System.out.println(add(4.5 , 8.9, 6.7));
    }


    static int add(double ...n) {
        double sum = 0;
        for (double i : n) {
            sum += i;
        }
        return (int) sum;
    }
}
