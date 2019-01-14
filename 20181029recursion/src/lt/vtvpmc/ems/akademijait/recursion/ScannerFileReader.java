package lt.vtvpmc.ems.akademijait.recursion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws Exception{
    readFileOne();

    }

    public static void readFileOne() throws Exception {
        String separator = File.separator; //cia tam kad paimti faila is desktopo ir kad veiktu ir ant Windows
        String path = separator + "home" + separator + "aidas" + separator + "Desktop" + separator + "java.txt";

        File file = new File(path);
        Scanner reader = new Scanner(file);

        BufferedWriter bw = new BufferedWriter(new FileWriter("kazkas.txt"));

        while (reader.hasNext()) {
            //System.out.println(reader.nextLine());
            String line = reader.nextLine();

            bw.write(line);
            ///sprendimui naudoti DataInputStream DataOutputStream (zr. Oracle doc);
        }
    }

    public static void writeFileOne () throws Exception {


    }

}
