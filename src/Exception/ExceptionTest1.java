package Exception;

import java.io.*;
import java.util.Scanner;

//try-with-resources
// 在 try-with-resources 语句中，任何 catch 或 finally 块在声明的资源关闭后运行
public class ExceptionTest1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}