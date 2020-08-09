package Exception;

import java.io.*;

public class ExceptionTest2 {
    public static void main(String[] args){
        try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("test.txt")));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("test.txt")))){
            int b;
            while ((b = bin.read()) != -1){
                bufferedOutputStream.write(b);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
