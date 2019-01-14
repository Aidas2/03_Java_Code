package lt.vtvpmc.akademija.lt.jdbc;

public class Main {
    public static void main(String[] args) {
        DbEngage dbEngage = new DbEngage();
        //dbEngage.query();
        //dbEngage.preparedQuery();
        dbEngage.updateThroughResultSet();
    }
}
