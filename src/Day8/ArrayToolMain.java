package Day8;
public class ArrayToolMain {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,34};
        System.out.println("数组长度是"+ arr.length);
         ArrayTool.getMax(arr);
         ArrayTool.getMin(arr);
         ArrayTool.selectSort(arr);
         ArrayTool.BubbleSort(arr);
         ArrayTool.printArray(arr);
        /*ArrayTool tool = new ArrayTool();
        tool.getMax(arr);*/
    }
}
