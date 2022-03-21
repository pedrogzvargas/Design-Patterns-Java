package creational.factory.method_factory;

import java.sql.Connection;

// Producto
public interface DBAdapter {
    Connection getConnection();
}
