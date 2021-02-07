package com.PrimeNums.PrimeNumbers;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,0, 7, 67, 89, 49,45, 11, -9};

        int i; int n=0;
        for(i=0; i<arr.length; i++) {
            boolean isPrime = true;
               if(arr[i]<=1) {
                   isPrime=false;
               } else if(arr[i]==2){
                   isPrime=true;

               }
               else {
              for( int j=2; j<arr[i]; j++) {
                  if (arr[i]%j==0) {
                      isPrime=false;
                     break;
                  }

                  }}
            if(isPrime) {
                System.out.println(arr[i]);
            }
        }








     }}