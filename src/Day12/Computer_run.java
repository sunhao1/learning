package Day12;


public class Computer_run {
    public void Run() {
        System.out.println("computer run");
    }

    public void usePCI(PCI P) {//PCI P =new NetCard();
        if (P != null) {
            P.open();
            P.close();
        }
    }
}
interface PCI {
    void open();

    void close();
}
class NetCard implements PCI {
    public void open(){
        System.out.println("open netcard");
    }
    public void close(){
        System.out.println("closs netcard");
    }
}
class SoundCard implements PCI {
    public void open() {
        System.out.println("open Soundcard");
    }

    public void close() {
        System.out.println("closs Soundcard");
    }
}