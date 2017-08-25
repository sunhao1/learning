package Day16;

public class Produce_Consumption {
    public static void main(String[] args) {
        Resouce rs = new Resouce();
        produce pd = new produce(rs);
        consumption cp = new consumption(rs);
        Thread T1= new Thread(pd);
        Thread T2= new Thread(pd);
        Thread T3= new Thread(cp);
        Thread T4= new Thread(cp);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        //这是针对多线程的通用方法。
    }
}

class Resouce {
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        while (flag)//线程每次唤醒都要识别flag
            try {
                this.wait();
            } catch (Exception e) {

            }
        this.name = name + "..." + count++;
        System.out.println(Thread.currentThread().getName() + "....生产者" + this.name);
        this.flag = true;
        this.notifyAll();//唤醒所有线程
    }
    public synchronized void out(){
        while(!flag)//线程每次唤醒都要识别flag
            try{
            this.wait();
            }
            catch (Exception e){}
        System.out.println(Thread.currentThread().getName() + "....消费者" + this.name);
            this.flag = false;
            this.notifyAll();//唤醒所有线程
    }
}

class produce implements Runnable {
    private Resouce res;

    produce(Resouce res) {
        this.res = res;
    }
    public void run(){
        while(true){
            res.set("..商品..");
        }
    }
}
class consumption implements Runnable{
    private Resouce res;
    consumption(Resouce res){
        this.res =res;
    }
    public void run(){
        while(true){
            res.out();
        }
    }
}

