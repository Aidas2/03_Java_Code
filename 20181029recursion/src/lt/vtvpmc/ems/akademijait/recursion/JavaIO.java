package lt.vtvpmc.ems.akademijait.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaIO {
    public static void main(String[] args) throws Exception {
        //bufferedReader();
        //systemInReader();
        inputStreamReader();
    }

    public static void bufferedReader () throws Exception  {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }

    public static void systemInReader() throws Exception {
        for (;;) {
            int byteValue = System.in.read();
            if (byteValue == 48) {  //48 yra 0 kodas ASCII lenteleje
                break;
            }
            System.out.println(byteValue);
        }
    }

    public static void inputStreamReader () throws Exception{
        for(;;) {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            int charValue = inputStreamReader.read();
            System.out.println(charValue);
            inputStreamReader.close();
        }
    }

}
