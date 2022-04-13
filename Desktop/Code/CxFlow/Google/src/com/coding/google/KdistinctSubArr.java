package com.coding.google;

import java.util.HashMap;

public class KdistinctSubArr {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 1, 3,4};
        int k = 3, startIndx = 0, endIndx = 0, count = 0;


        HashMap<Integer, Integer> hm = new HashMap<>();
        while (endIndx < nums.length) {

            if (hm.size() <= k) {
                hm.putIfAbsent(nums[endIndx], 0);
                hm.put(nums[endIndx], hm.get(nums[endIndx]) + 1);
                count += endIndx - startIndx + 1;
            } else {
                int sumCount = hm.get(nums[startIndx]);
                if (sumCount > 1) {
                    hm.put(nums[startIndx], hm.get(nums[startIndx]) - 1);
                } else {
                    hm.remove(nums[startIndx]);
                }
                startIndx++;
            }
            endIndx++;


        }
        System.out.println("Number of "+k+" Distict SubArray Is : "+count);

    }
}
