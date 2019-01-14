package lt.vtvpmc.akademija.lt.jdbc;

import java.sql.*;

public class DbEngage {

    Connection cn;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    //3. Sujungimas
    public DbEngage() {
        try {
            Class.forName("org.h2.Driver");
            cn = DriverManager.getConnection("jdbc:h2:~/Documents/db/jdbcTestas", "sa", "");
            st = cn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //4. Uzklausos rezultatas
    void query() {
        try {
            rs = st.executeQuery("select id,name from testtable");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID") + "name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //5.Parametrizuota uzklausa
    void preparedQuery() {
        try {
            pst = cn.prepareStatement("SELECT * FROM TESTTABLE WHERE name = ?");
            pst.setString(1, "pavardenis");
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(" name: " + rs.getString("name"));
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //6. Atnaujinimas per rezultatus
    void updateThroughResultSet () {
        try {
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select * from public.testtable");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
