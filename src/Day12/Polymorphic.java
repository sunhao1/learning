package Day12;

abstract public class Polymorphic {
    public abstract void Animal();
}

class cat extends Polymorphic {
    public void Animal() {
        System.out.println("吃鱼");
    }

    public void attribute_1() {
        System.out.println("catchmouse");
    }
}
class dog extends Polymorphic {
    public void Animal() {
        System.out.println("eatbone");
    }

    public void attribute_2() {
        System.out.println("takecarehome");
    }
}
class pig extends Polymorphic {
    public void Animal() {
        System.out.println("饲料");
    }

    public void attribute_1() {
        System.out.println("拱地");
    }
}


