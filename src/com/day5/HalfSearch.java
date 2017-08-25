package com.day5;

/**
 * Created by sunha on 2017/7/19.
 */
//对有序数组进行折半查找效率高
public class HalfSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,};
        halfsearch(arr,6);
    }

    public static void halfsearch(int[] arr, int key) {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (min + max)>>1;//   >>1 相当于/2
        while (arr[mid] != key) {
            if (arr[mid] < key)
                min = mid + 1;
            else if (arr[mid] > key)
                max = mid - 1;
            mid = (min + max) / 2;

        }
        System.out.print(mid);
    }
}
