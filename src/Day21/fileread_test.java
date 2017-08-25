package Day21;

import java.io.FileReader;
import java.io.IOException;

public class fileread_test {
    public static void main(String[] args) {
        FileReader fr = null;
        char[] buf = new char[1024];
        int num = 0;
        try {
            fr = new FileReader("E:\\java\\learning\\src\\Day21\\IO_exception_test.java");
            while ((num = fr.read(buf)) != 0) {
                System.out.println(new String(buf, 0, num));
            }
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
        finally {
            try {
                if(fr.read()==0)
                fr.close();
            }
            catch (IOException e){
                System.out.println(e.toString());
            }
        }
    }
}
