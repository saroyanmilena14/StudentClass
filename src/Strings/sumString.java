package Strings;

public class sumString {

    public static void main(String args[]) {
        String str = "6+7+8+9+5+23+56";
        int sum = 0;
        char plus = '+';
        String S1 = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) != plus) {
                S1 = String.valueOf(str.charAt(i));
            }
        }
           for(int j=0; j<S1.length();j++) {
               sum+= Integer.parseInt(String.valueOf(S1.charAt(j)));
               System.out.println(sum);
           }
    }
}