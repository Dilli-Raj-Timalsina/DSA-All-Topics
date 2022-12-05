package com.nischal;

public class MaxItemIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 45, 4}, {02, 6, 9, 2676}, {19, 8}};
        System.out.println(maxItem(arr));
    }

    static int maxItem(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }
}
