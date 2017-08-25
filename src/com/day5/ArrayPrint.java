package com.day5;

/**
 * Created by sunha on 2017/7/17.
 */
public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr = new int[]{45, 20, 52, 42, 12, 13};
        //System.out.println("length" + " " + arr.length);
        /*int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
            System.out.println("length" + " " + arr.length);
            if (x < arr.length - 1)
                System.out.println("arr[" + x + "]" + "=" + arr[x] + ";");
            else
                System.out.println("arr[" + x + "]" + "=" + arr[x]);
        }
        System.out.println(sum);*/

        //ArrayPr(arr);
        ArrayPr(arr);
    }

    //写一个方法来调用数组；
    //此函数包括输出数组个数，输出角标值，输出数组值。
    public static void ArrayPr(int[] arr) {
        int sum = 0;
        System.out.println("length" + " " + arr.length);
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];

            if (x < arr.length - 1)
                System.out.print("arr[" + x + "]" + "=" + arr[x] + ";");
            else
                System.out.println("arr[" + x + "]" + "=" + arr[x]);
        }
        System.out.println(sum);
    }

}
