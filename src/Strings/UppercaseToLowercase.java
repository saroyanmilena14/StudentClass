package Strings;

public class UppercaseToLowercase {

    public static void main(String args[]) {
        String original = "MAD world";
        String blab = "";
        for (int i = 0; i < original.length(); i++) {
            for (int j = 0; j < blab.length(); j++) {
                char c = original.charAt(i);
                int letter = (int) c;
                if (letter >= 65 && letter <= 90) {
                    letter += 32;
                    char b = (char) letter;
                    boolean Upper= true;
                    blab += letter;
                } else if (letter >= 97 && letter <= 122) {
                    letter -= 32;
                    char b = (char) letter;
                    blab += letter;
                }
            }
            }
            System.out.println(blab);
        }

    }
