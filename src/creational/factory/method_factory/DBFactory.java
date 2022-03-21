package creational.factory.method_factory;

public class DBFactory {
    public enum DBType{MySQL, Oracle, PostgreSQL}
    public static DBAdapter getDBAdapter(DBType dbType){
        return switch (dbType) {
            case MySQL -> new MySQLAdapter();
            case Oracle -> new OracleAdapter();
            case PostgreSQL -> new PostgreSQLAdapter();
        };
    }
}
