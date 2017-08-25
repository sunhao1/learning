package Day15;

public class Bank_Runnable {
    public static void main(String[] args) {
        cus c = new cus();
        Thread t0 = new Thread(c);
        Thread t1 = new Thread(c);
        t0.start();
        t1.start();
    }

}

class Bank {
    private int sum;
    Object obj = new Object();

    public void Add(int n) {
        synchronized (obj) {
            sum = sum + n;
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            System.out.println("总额=" + sum);
        }
    }
}

class cus implements Runnable {
    Bank b = new Bank();

    public void run() {
        for (int x = 0; x < 3; x++)
            b.Add(100);
    }
}

