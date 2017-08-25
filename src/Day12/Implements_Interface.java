package Day12;

abstract class Implements_Interface {
    public abstract void Study();

    void Sleep() {
        System.out.println("睡觉");
    }
}

interface inter {
    void smoke();
}

class Auto extends Implements_Interface implements inter {
    public void Study() {
        System.out.println("好好学习");
        Sleep();
    }
    public void smoke() {
        System.out.println("抽烟");
    }
}


