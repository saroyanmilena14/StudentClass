package Functions.str;

public class duplicateFunction {
    public static void main(String args[]) {

        String[] str1 = {"greg", "threat", "noor", "iris"};
        for (String str2 : str1) {
            duplicateFunction(str2);
        }
    }

    static void duplicateFunction(String strResult) {
        for (int i = 1; i < strResult.length(); i++) {
            if (strResult.charAt(0) == strResult.charAt(i)) {
                System.out.println(strResult);
            }
        }
    }
}




