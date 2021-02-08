package RepeatedNums.Arrays;

public class RepeatNumbs {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 4, 6, 4, 7, 4, 5, 5, 8, 8, 9};

        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            boolean isDuplicate=true;
            for (j = i + 1; j < arr.length; ) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                } else {
                    j++;
                }
                for(int k=i ; k>0; k--){
                    if (arr[i] == arr[k]) {
                        isDuplicate = false;
                        break;
                    }
                }
                if(isDuplicate) {
                    System.out.println(arr[i]);
                }
            }

          }
    }
}




