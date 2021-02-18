package Strings;

public class UppercaseToLowercase {

    public static void main(String args[]) {
        String original = "MAD world";
        String str = "";
        int a;
        char c;
        for (int i = 0; i < original.length(); i++) {
            a = original.charAt(i);
            if (a >= 65 && a <= 90) {
                a += 32;
                c = (char) a;
                str += c;
            } else if (a >= 97 && a <= 122) {
                a -= 32;
                c = (char) a;
                str += c;
            } else {
                str += ' ';
            }
        }
            System.out.println(str);

}
}