package Day21;

import java.io.FileWriter;
import java.io.IOException;

public class IO_exception_test {
    public static void main(String[] args)throws IOException {
        FileWriter fw = null;

        try{
            fw = new FileWriter("E:\\mysecondfile");
            fw.write("sunhao");
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
        finally {
            try {
                if(fw!=null)
                   fw.close();
            }
            catch(IOException e){
                System.out.println(e.toString());
           }
        }

    }
}
