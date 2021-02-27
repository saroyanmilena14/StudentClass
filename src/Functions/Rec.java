package Functions;

public class Rec {
    public static void main(String[] args) {
        String string = "abcdefg";
        System.out.println(StrRecFunc(string));
    }


    static String StrRecFunc(String str) {

        String str2 = "";
        int i = str.length() -1;
        if (i >=0) {
          str2=str.charAt(i)+StrRecFunc(str.substring(0,i));
        }
        return str2;
    }
}
