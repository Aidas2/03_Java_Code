package lt.vtvpmc.ems.IOStream.lt.vtvpmc;

import java.io.*;

public class AppIOStream {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("D:\\temp\\labas.txt"); //cia tik ant Windows (Linuxe reikia nuorodos i roota
            //FileOutputStream  fos = new FileOutputStream("output.txt");
            OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream("output.txt"));
            ) {

            while(fis.available() > 0) { //kol yra ka skaityti tol skaito (baitais)
                //System.out.println((char)fis.read()); //castinami char
                int byteRead = fis.read(); //Read a byte from input
                System.out.println((char) byteRead); //castinami char
                fos.write(byteRead); //Write the same byte to output
            }

            //Writer writer = new OutputStreamWriter(fos); //wraperis kuris stringa iraso dar papildomai
            //writer.write("Done");
            //fos.write("Done!".getBytes()); //visas sitas nebeveikia po skliaustu uzdejimo try
            fos.write("Done !!");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//inputir output visada reikia uzdaryti (geriausia ikeliant i try kodo dali)