package Day16;

public class PV_Thread {
    public static void main(String[] args) {
        /*cress c = new cress();
        new Thread(new input(c)).start();
        new Thread(new input(c)).start();*/

        cress CC = new cress();
        input I = new input(CC);
        output O = new output(CC);
        Thread T1 = new Thread(I);
        Thread T2 = new Thread(O);
        T1.start();
        T2.start();
    }
}

class cress {
    private String name;
    private String sex;
    private boolean flag = false;
    public synchronized void set (String name,String sex){
        if(flag)
            try{this.wait();}
            catch (Exception e){}
        this.name = name;
        this.sex = sex;
        this.flag = true;
        this.notify();
    }
    public synchronized void out(){
        if(!flag)
            try{this.wait();}
            catch (Exception e){ }
        System.out.println(this.name + "....." + this.sex);
            this.flag = false;
            this.notify();
    }

}

class input implements Runnable {
    private cress r;

    input(cress r) {
        this.r = r;
    }

    public void run  () {
        int x = 0;
        while (true) {
            if (x == 0) {//切换动作
                r.set("孙浩","男");
            }
            else {
                r.set("sunhao","man");
            }
            x = (x + 1) % 2;//切换动作
        }

    }
}

class output implements Runnable {
    private cress r;
    output(cress r) {
        this.r = r;
    }
    public void run() {
        while (true) {
            r.out();
        }
    }
}