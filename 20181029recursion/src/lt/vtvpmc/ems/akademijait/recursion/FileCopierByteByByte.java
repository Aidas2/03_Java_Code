package lt.vtvpmc.ems.akademijait.recursion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopierByteByByte {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("java.txt");
        FileOutputStream fos = new FileOutputStream("java_new.txt");
        try {
            int stack;
            while ((stack = fis.read()) != -1) { //-1 reiskia kad failas nuskaitytas
                fos.write(stack);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (fis != null) { //<--null
                fis.close();
                System.out.println("Closed"); //pasitikrinimui ar srautas uzdarytas;
            }
            if (fos != null) {
                fos.close();
                System.out.println("Closed");
            }
        }

    }
}
