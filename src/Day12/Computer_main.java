package Day12;

public class Computer_main {
    public static void main(String[] args) {
        Computer_run CR = new Computer_run();
        CR.Run();
        CR.usePCI(null);
        CR.usePCI(new NetCard());
        CR.usePCI(new SoundCard());
    }
}
