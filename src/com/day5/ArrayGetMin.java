package com.day5;

/**
 * Created by sunha on 2017/7/17.
 */
public class ArrayGetMin {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 9};
        GetMin(arr);
    }

    public static void GetMin(int[] arr) {
        int min = 9;
        for (int x = 0; x < arr.length; x++) {
            if (min < arr[x])
               System.out.print(" ");
            else
                min = arr[x];

        }
       System.out.print("最小值" + min);

    }


}
