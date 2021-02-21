package Functions.str;

public class overloadingFunctions {
    public static void main(String args[]) {
         String strstr ="abcdefg";
        System.out.println(substring(strstr,3, 7));
        System.out.println(substring(strstr, 3));

    }


    static String substring(String str, int start, int end) {
        String str1="";
            for(int i=start; i<end; i++) {
                str1+=str.charAt(i);
            }
            return str1;

    }


    static String substring (String str, int start) {
        String str2="";
        for(int i=start; i<str.length(); i++) {
            str2+=str.charAt(i);
        }
        return str2;
    }


}
