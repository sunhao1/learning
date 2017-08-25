package Day15;

public class Tickets_Runnable {
    public static void main(String[] args) {
        Ticket T = new Ticket();
        Thread t1 = new Thread(T);
        Thread t2 = new Thread(T);
        Thread t3 = new Thread(T);
        Thread t4 = new Thread(T);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Ticket implements Runnable{
    Object obj = new Object();
    public int ticket = 100;
    public void run(){
        while(true){
            synchronized(obj) {
                if (ticket > 0) {
                    try{
                        Thread.sleep(10);
                    }
                    catch (Exception e) {
                    }

                    System.out.println(Thread.currentThread().getName() + "...sale..." + ticket--);
                }
            }
        }
    }
}
