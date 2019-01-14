package lt.vtvpmc.ems.aidas.Pabandymui;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class JavaClient {
  public static void main(String args[]) throws Exception {
    Socket socket = new Socket("localhost", 3333);
    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String stringOne = "", stringTwo = "";
    while (!stringOne.equals("stop")) {
      stringOne = bufferedReader.readLine();
      outputStream.writeUTF(stringOne);
      outputStream.flush();
      stringTwo = dataInputStream.readUTF();
      System.out.println("Server says: " + stringTwo);
    }

    outputStream.close();
    socket.close();
  }
}
