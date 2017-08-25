package Day14;

public class exception_1 {
    public static void main(String[] args)  {
        Demo DD = new Demo();
        int x = DD.idev(4,0);
        System.out.println(x);
        System.out.println("over");
        /*try{
            int x = DD.idev(4,0);
            System.out.println(x);
        }
        catch (Exception E){
            System.out.println("除数为零了");
            System.out.println(E.getMessage());
            System.out.println(E.toString());
            E.printStackTrace();
        }*/
    }
}
class Demo {
    int idev(int a,int b) {
        return a/b;
    }
}
