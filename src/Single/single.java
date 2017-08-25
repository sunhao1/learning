package Single;

public class single {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return num;
    }
//该类默认的
    private single() {
        System.out.println();
    }
//为构造函数生成对象，
    private static single s = new single();
//提供一个方法来调用该对象。
    public static single GetInstance() {
        return s;
    }
}
