package com.coding.google;

import java.util.Arrays;

public class SortedArrayProblem {

    public static void main(String[] args) {

        int[] arr1 = new int[]{0, 2, 6, 8, 9};
        int[] arr2 = new int[]{1, 3, 5, 7};
        int n = arr1.length, m = arr2.length;

        int gap = calculateGap(m + n);
        int i , j ;

        /*
        for (gap = calculateGap(gap); gap > 0; gap = calculateGap(gap)) {
            for (i = 0; i + gap < n; i++) {
                if(arr1[i]>arr1[i+gap])
                arr1[i] += arr1[i + gap] - (arr1[i + gap] =arr1[i]);
            }
            for (j=(gap>n)?gap-n:0;i<n && j<m ; i++,j++) {
                if(arr1[i]>arr2[j])
                arr1[i] += arr2[j] - (arr2[j] =  arr1[i]);

            }

            if(j<m){
                for (j=0;j+gap<m;j++) {
                    if(arr2[j]>arr2[j+gap])
                        arr2[j] += arr2[j+gap] - (arr2[gap+j] =  arr2[j]);
                }
            }
            System.out.println("Array One : " + Arrays.toString(arr1));
            System.out.println("Array Two : " + Arrays.toString(arr2));
        } */

        while (gap > 0) {

            //Intra Array Swapping between arr1 && arr1
            for (i = 0; i + gap < arr1.length; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }


            //Inter Array Swapping between arr1 && arr2
            for (j = gap > arr1.length ? gap - arr1.length : 0; i < arr1.length && j < arr2.length; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            //Intra Array Swapping between arr2 && arr2
            if (j < arr2.length) {
                for (j = 0; j + gap < arr2.length; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }


            gap = calculateGap(gap);
        }


        System.out.println("Array One : " + Arrays.toString(arr1));
        System.out.println("Array Two : " + Arrays.toString(arr2));

    }


    public static int calculateGap(int n) {
        if (n <= 1) return 0;
        return (n / 2 + n % 2);
    }


}
