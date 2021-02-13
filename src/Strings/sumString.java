package Strings;

public class sumString {

    public static void main(String args[]) {
        String s = "2352+8425+3256";
        String[] numArr = s.split("\\+");
        int sum = 0;
        for (String strNum: numArr) {
            sum = sum + Integer.parseInt(strNum);
        }
        System.out.println(sum);
    }
}
//int a = c- '0'