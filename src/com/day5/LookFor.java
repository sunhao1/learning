package com.day5;

/**
 * Created by sunha on 2017/7/18.
 */
public class LookFor {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 8, 45, 34, 8, 8};
        //GetIndex(arr, 18);
        int Index = GetIndex(arr,9);
        System.out.print(Index);
    }

    /*public static void GetIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == key)
                System.out.println("数据在第" + x + "位");
        }
        System.out.print(-1);
    }*/
    public static int GetIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == key)
                return x;
        }
        return -1;
    }
}
