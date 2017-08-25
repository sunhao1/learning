package com.day5;

/**
 * Created by sunha on 2017/7/17.
 */
public class ArrayGetMax {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 5, 7, 2};
        GetMax(arr);
        GetMin(arr);
    }

    public static void GetMax(int[] arr) {
        int max = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        System.out.println("最大值" + max);
    }

    public static void GetMin(int[] arr) {
        int min = 9;
        for (int x = 0; x < arr.length; x++) {
            if (min > arr[x]) ;
            min = arr[x];
        }
        System.out.print("最小值" + min);
    }
}
