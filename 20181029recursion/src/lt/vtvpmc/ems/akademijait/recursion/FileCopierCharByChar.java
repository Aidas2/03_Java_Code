package lt.vtvpmc.ems.akademijait.recursion;

import java.io.*;

public class FileCopierCharByChar {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("java.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("java3.txt"));

        try {
            int stack;
            while ((stack = isr.read()) != -1) { //-1 reiskia kad failas nuskaitytas
                osw.write(stack);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (isr != null) { //<--null
                isr.close();
                System.out.println("Closed"); //pasitikrinimui ar srautas uzdarytas;
            }
            if (osw != null) {
                osw.close();
                System.out.println("Closed");
            }
        }


    }

}
