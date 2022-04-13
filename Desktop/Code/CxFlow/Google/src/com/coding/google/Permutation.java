package com.coding.google;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

        permutationFind(arr, arr.length);

    }

    public static void permutationFind(int[] arr, int length) {
        if (length <= 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < length; i++) {
            arr[i] += arr[length - 1] - (arr[length - 1] = arr[i]);
            permutationFind(arr, length - 1);
            arr[length - 1] += arr[i] - (arr[i] = arr[length - 1]);
        }


    }


}
