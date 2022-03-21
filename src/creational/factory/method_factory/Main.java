package creational.factory.method_factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBAdapter dbAdapter = DBFactory.getDBAdapter(DBFactory.DBType.MySQL);
        Connection connection = dbAdapter.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("SELECT * FROM x");
    }
}
