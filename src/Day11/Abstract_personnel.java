package Day11;

abstract class Abstract_personnel {
    abstract void name();
    void sleep(){
        System.out.println("午休");
    }
}
class Base extends Abstract_personnel{
    void name(){
        System.out.println("王潇");
        System.out.println("孙浩");
        sleep();
    }

}
class Advance extends Abstract_personnel{
    void name(){
        System.out.println("张三");
        System.out.println("李四");
    }
}
