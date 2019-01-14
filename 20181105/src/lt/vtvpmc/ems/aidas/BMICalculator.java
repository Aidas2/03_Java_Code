package lt.vtvpmc.ems.aidas;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        calculatePeopleBMI();

    }

    public static void calculatePeopleBMI() throws IOException {
        int mass;
        double height; // in meter
        double bmi;
        String number;

        //Scanner skaito iskart viska, o bufferReader po gabaliuka (geriau dideliems failams)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input client number: ");
        number = bufferedReader.readLine();
        System.out.println("Input client mass: ");
        mass = Integer.parseInt(bufferedReader.readLine()); //parsinam i integeri
        System.out.println("Input client height: ");
        height = Double.parseDouble(bufferedReader.readLine()); //parsinam i double
        bmi = mass / Math.pow(height,2);

//        String clientRecomendation;
//        switch (bmi) {
//        }


        //DataOutputStream yra kieciau nes gali rasyti obkektus
        // append:true yra skirtas kad 'prikabintu' nauja matavima prie buvusiu
        try(FileOutputStream fileOutputStream = new FileOutputStream(number + ".txt", true)) {
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            Date date = new Date();

            dataOutputStream.writeBytes("Date: " + date + "\n");
            dataOutputStream.writeBytes("Height: " + height + "\n");
            dataOutputStream.writeBytes("Mass: " + mass + "\n");
            dataOutputStream.writeBytes("BMI: " + bmi + "\n");
            //dataOutputStream.writeBytes("BMI: " + clientRecomendation + "\n");
        } catch (FileNotFoundException e) {
            //J.U.L.
            e.getStackTrace();
            Logger.getLogger(BMICalculator.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            System.out.println("error: " + e);
        } finally {
            //cia reiktu uzdaryti viska: date ir kt. (FILO principu - kokia tvarka atidariom, tokia ir uzdarom) Bet cia uzsidaro automatiskai nes viskas yra try skliaustuose
            System.out.println("Viskas pasibaige");
        }


    }

}