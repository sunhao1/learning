package Single;

public class single_1 {
    public static void main(String[] args) {
        single s1 = single.GetInstance();
        single s2 = single.GetInstance();
        s1.setNum(23);//给s1赋值，s2没赋值，输出s2的结果一样。
        System.out.println(s2.getNum());

    }
}
//内存中自始至终都是一个对象。s1和s2都是对一个对象操作的。