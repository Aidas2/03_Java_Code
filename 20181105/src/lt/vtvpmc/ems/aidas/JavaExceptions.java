package lt.vtvpmc.ems.aidas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaExceptions {
    public static void main(String[] args) throws ArithmeticException{
        //Unchecked Exceptions

//         System.out.println(5 / 0);

//        Object object = null;
//        System.out.println(object.toString()); //NullPointerException

//        Object object = new Object();
//        Human human = new Human();
//        System.out.println(human instanceof Object); //true
//        System.out.println(object instanceof Human); //false

        callFileException();

        try {
        callFileExceptionThrow();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }

    private static void callFileException() {
        File file = new File("/homer/test.txt"); //specialiai neteisigas home kad mestu exception
                                                            // jei teisingai tai tada Permission denied
        try {
            file.createNewFile();
        } catch (IOException e) {
            //e.getStackTrace();
            System.out.println(e);
        }
    }

    private static void callFileExceptionThrow() throws IOException{
        File file = new File("dir1/test.txt");
            file.createNewFile();

    }




}
