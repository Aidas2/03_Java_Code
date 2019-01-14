package lt.pupelis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pagrindine {

	public static void main(String[] args) {
/////////Duomenu insert'inimas i duomenu baze	
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:D:/vilniuscoding.lt/PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES/Google Drive/SuperUltraMega");	      
	      c.setAutoCommit(false);
	      System.out.println("Sekmingai prisijungta prie duomenu bazes");

	      stmt = c.createStatement();
	      String sql = "INSERT INTO UZSAKYMAI VALUES (8, '2017.01.01', 'Yra', 320);";	      
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Irasai sukurti sekmingai!");
		
////////////////////////////////////////////////////////////////////////////
////////Duomenu paemimas (select'inimas) is duomenu bazes
		Connection c = null;
	    Statement stmt = null;
	    int count = 0;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:D:/vilniuscoding.lt/PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES/Google Drive/SuperUltraMega");	      
	      c.setAutoCommit(false);
	      
	      try {
              Statement st = c.createStatement();
              BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
              ResultSet res = st.executeQuery("SELECT COUNT(*) FROM KLIENTAI");
              while (res.next()){
                  count = res.getInt(1);
              }
              System.out.println("Number of row:"+count);
          }
          catch (SQLException s){
              System.out.println("SQL statement is not executed!");
          }
	  }
}
}