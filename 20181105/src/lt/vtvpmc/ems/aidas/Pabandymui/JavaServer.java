package lt.vtvpmc.ems.aidas.Pabandymui;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServer {
  public static void main(String args[]) throws Exception {
    ServerSocket serverSocket = new ServerSocket(3333);
    Socket socket = serverSocket.accept();
    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String stringOne = "", stringTwo = "";
    while (!stringOne.equals("stop")) {
      stringOne = dataInputStream.readUTF();
      System.out.println("client says: " + stringOne);
      stringTwo = bufferedReader.readLine();
      dataOutputStream.writeUTF(stringTwo);
      dataOutputStream.flush();
    }
    dataInputStream.close();
    socket.close();
    serverSocket.close();
  }
}

