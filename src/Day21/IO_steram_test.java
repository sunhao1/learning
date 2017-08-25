package Day21;

import java.io.FileWriter;
import java.io.IOException;

public class IO_steram_test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("myfistfile");
        fw.write("abcdefghaha");
        fw.flush();
        fw.close();
    }
}
