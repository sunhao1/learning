package Day6;

/**
 * Created by sunha on 2017/7/19.
 */
public class DecimalConversion {
    public static void main(String[] args) {
        toBin_1(60);
        //toHex(60);
        //System.out.println();
        //toHex_1(60);
        //System.out.print(Integer.toBinaryString(60));

    }

    //十进制转换成二进制
    public static void toBin(int num) {
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        System.out.println(sb.reverse());
    }

    //十进制转换成16进制
    /*public static void toHex(int num) {
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < 8; x++) {
            int temp = num % 16;
            if (temp > 9)
                sb.append((char) (temp - 10 + 'A'));
            else
                sb.append(temp);
            num = num >>> 4;
        }
        System.out.println(sb.reverse());
    }*/
    public static void toHex(int num) {
        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        //定义一个临时容器，不用StringBuffer.
        char[] arr = new char[8];
        int pos = arr.length;
        while (num != 0) {
            int temp = num % 16;
            arr[--pos] = chs[temp];
            num = num >>> 4;
        }
        for (int x = pos; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
    }

    public static void toHex_1(int num) {
        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int x = 0; x < 8; x++) {
            int temp = num % 16;
            System.out.print(chs[temp]);
            num = num >>> 4;
        }

    }

    //十进制转换通用函数。
    public static void trans(int num, int base, int offeset) {
        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        //定义一个临时容器，不用StringBuffer.
        char[] arr = new char[32];
        //定一个指针
        int pos = arr.length;

        while (num != 0) {
            int temp = num % base;
            arr[--pos] = chs[temp];
            num = num >>> offeset;
        }
        for (int x = pos; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
    }
//二进制转换
    public static void toBin_1(int num) {
        trans(num,16,4);
    }
}


