package lt.vtvpmc.ems.aidas.Pabandymui;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class JavaUrlConnection {
  public static void main(String[] args) {
    try {
      URL url = new URL("http://vtvpmc.lt");
      URLConnection urlConnection = url.openConnection();
      InputStream stream = urlConnection.getInputStream();
      int i;
      while ((i = stream.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
