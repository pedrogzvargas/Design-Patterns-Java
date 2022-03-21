package creational.factory.method_factory;

import java.sql.Connection;

// Producto concreto
public class MySQLAdapter implements DBAdapter{
    @Override
    public Connection getConnection() {
        Connection connection = null;
        return connection;
    }
}
