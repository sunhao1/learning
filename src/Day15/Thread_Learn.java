package Day15;

public class Thread_Learn {
    public static void main(String[] args) {

        Deam_T DD= new Deam_T();
        DD.test("孙浩");
        DD.start();

        Deam_T DDD = new Deam_T();
        DD.test("张三");
        DDD.start();
        //Demo_test D = new Demo_test();
        //D.Test();
       //for(int z = 0;z<60;z++){
            //System.out.println("%%%"+z);
        //}

    }
}
class Deam_T extends Thread{
    private String name;
     void test(String name){
        this.name = name;
    }
    public void run(){
        for(int x = 0;x<60;x++)
        System.out.println(this.getName()+"  "+ "---"+x);
    }
}
class Demo_test {
    void Test(){
        for(int y = 0;y<60;y++){
            System.out.println("==="+y);
        }
    }
}