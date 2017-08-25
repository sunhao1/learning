package Day7;
/**
 * Created by sunha on 2017/7/24.
 */
public class Person_2 {
    private String name;
    private int age;
/*构造函数代码块
对象一建立就运行而且优先于构造函数执行
给在这个类中的构造函数初始化
*/

    /*{
        System.out.println("cry");
    }*/


    /*
构造函数的重载：函数名要和类名要一致。
*/
    Person_2() {

        System.out.println("无名氏");
    }
    Person_2(String Q) {
        name = Q;
        System.out.println("name="+name);
    }
    Person_2(String A, int B) {
        Cry();
        name = A;
        age = B;
        Speak();
    }
    public void Setname(String x){
        name = x;
        Speak();
    }
    public int Getage(){
        return age;
    }
    void Cry() {
        System.out.println("cry");
    }

    void Speak() {
        System.out.println("name=" + name + "  " + "age=" + age);
    }

}
