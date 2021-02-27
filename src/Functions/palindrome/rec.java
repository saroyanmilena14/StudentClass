package Functions.palindrome;



public class rec {

    public static void main(String[] args) {
        String string = "level";
        System.out.println(PalindromeRecFunc(string));

    }

    static boolean PalindromeRecFunc(String str) {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length() - 1))
            return PalindromeRecFunc(str.substring(1, str.length() - 1));
        return false;
} }
