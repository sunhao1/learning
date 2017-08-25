package com.day5;

import java.util.*;

/**
 * Created by sunha on 2017/7/17.
 */
public class SlecteSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 8, 9, 7, 10};
        System.out.println("数组长度是" + arr.length);
        //Arrayprite(arr);
        Bubblesort(arr);
        Arrays.sort(arr);
       // System.out.println();

        //Arrayprite(arr);
    }

    //选择排序
    public static void slecte(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = 0;
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

    public static void Arrayprite(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x < arr.length)
                System.out.print("[" + x + "]" + "=" + arr[x] + ";  ");

        }
    }

    //冒泡排序
    public static void Bubblesort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y + 1] < arr[y]) {
                    /*int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    */
                    swap(arr, y, y + 1);
                }
            }
        }

    }

    //置换函数；
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
