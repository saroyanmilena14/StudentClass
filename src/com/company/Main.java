package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner commandLine = new Scanner(System.in);
        System.out.print("Input x ");
        int x = commandLine.nextInt();
        int[] arr = {25,44};

        System.out.println(arr[x]);

    }
}
