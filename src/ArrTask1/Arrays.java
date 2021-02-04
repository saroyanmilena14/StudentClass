package ArrTask1;


public class Arrays {
    public static void main(String[] args) {
        int PositiveNumsCount=0;
        int NegativeNumsCount=0;
        int [] arr ={ 1 , -89, 0, 34 , -5, 16, -76 };
          int i;
          for (i=0; i< arr.length; i++) {
              if (arr[i] > 0) {
                  PositiveNumsCount++;
              } else if( arr[i]<0)
              {
                  NegativeNumsCount++;
              }
          }
              System.out.println("The count of positive numbers is" + " " + PositiveNumsCount);
              System.out.println("The count of negative numbers is" + " " + NegativeNumsCount);

    }
}
