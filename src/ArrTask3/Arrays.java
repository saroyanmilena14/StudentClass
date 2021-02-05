package ArrTask3;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = {6, 7,3,4,3,7, 6};
        boolean arrIsPalindrome=true;
        int i;
        for(i=0; i<arr.length/2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                arrIsPalindrome = false;
                break;
            }
        }
          if (arrIsPalindrome) {
              System.out.println("Tha Array is palindrome");
          }  else {
              System.out.println("The Array isn't palindrome");
          }

    }
}