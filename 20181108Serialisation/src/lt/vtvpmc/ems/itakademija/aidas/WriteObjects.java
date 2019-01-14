package lt.vtvpmc.ems.itakademija.aidas;

//SERIALIZACIJA

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
//        Person person1 = new Person (1, "Tomas Tribusauskas");
//        Person person2 = new Person (2, "Justina Balse");
//         uzkomentinam (cia ir toliau) tam kad idet juos i masyva kuri isiusim

        Person [] people = {new Person (1, "Tomas Tribusauskas"), new Person (2, "Justina Balse"), new Person (3, "Giedrius")};


        try (ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("people.bin"))) {
////            FileOutputStream fileOutputStream = new FileOutputStream("people.bin"); //sugeneruotas try/catch
////            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(person1);
//            objectOutputStream.writeObject(person2);

////            objectOutputStream.writeInt(people.length);
////
////            for (Person person : people) {
////                objectOutputStream.writeObject(person); //irasineja visa asmenu masyva, o ne atskiras personas
////            }

            objectOutputStream.writeObject(people);

////            objectOutputStream.close(); //uzdarymus ismetam per "try with resourcers"
////            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
