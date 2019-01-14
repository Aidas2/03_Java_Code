package lt.vtvpmc.ems.itakademija.aidas;

//SERIALIZACIJA

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjects {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("people.bin"))) {
////            FileInputStream fileInputStream = new FileInputStream("people.bin");
////            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //gauta info apie objekta vel paverciam i objekta (plius castinam):
//            Person personOne = (Person)objectInputStream.readObject();
//            Person personTwo = (Person)objectInputStream.readObject();
//            System.out.println(personOne);
//            System.out.println(personTwo); // viska uzkomentavom (ta pati priezastis - skaitom ne personas, o visa ju masyva)

////            int personCount = objectInputStream.readInt();
////
////            Person [] people = new Person[personCount]; // naujo masyvo dydis atitinka personu kieki gautamame objekte
////
////           for (int i = 0; i < personCount; i++) {
////                people[i] = (Person) objectInputStream.readObject();
////            }

            Person[] people = (Person[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(people));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

