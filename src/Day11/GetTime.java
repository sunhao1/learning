package Day11;

/*
1,获取程序运行的时间；
2，获取程序开始和结束时间，并相减即可。
3，获取时间用System.currentTimeMillis();
*/
public abstract class GetTime {
     final void getTime() {            //final属于优化代码，可以解决这一类问题。这就是模板方法。
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
        System.out.println("毫米" + (end - start));
    }

    public abstract void runcode();
}

class SubTime extends GetTime {
    public void runcode() {

        for (int x = 0; x < 3000; x++) {
            System.out.println("毫秒" + x);
        }
    }
}
