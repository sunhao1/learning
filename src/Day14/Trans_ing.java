package Day14;

public class Trans_ing {
    public static void main(String[] args) {
        Teacher TT = new Teacher("sunhao");
        try{
            TT.perfect();
        }
        catch (noplan_exception e){
            System.out.println("放假"+e);
        }
    }
}

class lanping_exception extends Exception {
    lanping_exception(String message) {
        super(message);
    }
}

class maoyan_exception extends Exception {
    maoyan_exception(String message) {
        super(message);
    }
}

class noplan_exception extends Exception {
    noplan_exception(String msg) {
        super(msg);
    }
}

class Computer {
    private int state = 3;

    public void run() throws lanping_exception, maoyan_exception {
        if (state == 2)
            throw new lanping_exception("电脑蓝屏了");
        if (state == 3)
            throw new maoyan_exception("电脑冒烟了");
        System.out.println("电脑运行");
    }

    public void restart() {
        System.out.println("电脑重启");
    }
}

class Teacher {
    private String name;
    private Computer cmpt;

    Teacher(String name) {
        this.name = name;
        cmpt = new Computer();
    }

    public void perfect() throws noplan_exception {
        try {
            cmpt.run();
        } catch (lanping_exception e) {
            System.out.println("电脑蓝屏了");
            cmpt.restart();
        } catch (maoyan_exception e) {
            //System.out.println("电脑冒烟了");

            throw new noplan_exception("课时无法按时完成"+"原因是"+e.getMessage());

        }

        System.out.println("开始上课");
        System.out.println("上课老师是：" + name);
    }
}
