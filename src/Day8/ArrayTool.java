package Day8;

public class ArrayTool {
    public static void getMax(int[] arr) {
        int max = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > arr[max])
                max = x;
        }
        System.out.println(arr[max]);
    }

    public static void getMin(int[] arr) {
        int min = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < arr[min]) {
                min = x;
            }
        }
        System.out.println(arr[min]);
    }

    //排序
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length - 1; y++) {
                if (arr[x] < arr[y]) {
                    swap(arr, x, y);

                }
            }
        }
        System.out.println(arr);
    }

    //冒泡排序
    public static void BubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    swap(arr, y, y + 1);
                }
            }
        }
        System.out.println(arr);
    }

    //互换
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//打印数组和求数组和。
    public static void printArray(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
            if (x < arr.length - 1)
                System.out.print("arr[" + x + "]" + "=" + arr[x] + "," + " ");
            else
                System.out.println("arr[" + x + "]" + "=" + arr[x]);
        }
        System.out.println("数组之和" + sum);

    }
}
