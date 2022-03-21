package creational.factory.method_factory;

import java.sql.Connection;

public class OracleAdapter implements DBAdapter{
    @Override
    public Connection getConnection() {
        Connection connection = null;
        return connection;
    }
}
