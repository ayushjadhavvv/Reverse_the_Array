package com.ayush;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseTheArray {

    public static void main(String[] args) {
        //Take inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];

        //take in values of array
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //main part of the code
        int temp;
        int start = 0;
        int end = n-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("The values after reversal are");
        for(int i = 0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
