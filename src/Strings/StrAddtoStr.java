package Strings;

public class StrAddtoStr {

    public static <string> void main(String args[]) {

        String firstNum = "945";
        String secondNum = "154";
        String sum = "";
        int first = 0;
        int second = 0;
        int result = 0;
        int remaining = 0;
        for (int i = firstNum.length() - 1; i >= 0; i--) {
            first = firstNum.charAt(i) - '0';
            second = secondNum.charAt(i) - '0';
            result = first + second + remaining;
            if (result > 9) {
                remaining = 1;
                result = result % 10;
            } else {
                remaining = 0;
            }
              if(remaining==1) {
                  sum+=remaining;
              }
            sum += result;
        }
            System.out.println(sum);

                 String result1 = "";
        for (int j= sum.length() - 1; j >= 0; j--) {
            result1 = result1 + sum.charAt(j);
        }

        System.out.println(result1);
    }
    }





