abstract class DatabaseConnection {
    public abstract void connect();
    public abstract void executeQuery(String query);
}
class MySQLConnection extends DatabaseConnection {
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}

class OracleConnection extends DatabaseConnection {
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
    public void executeQuery(String query) {
        System.out.println("Executing Oracle query: " + query);
    }
}

public class Base {
    public static void main(String[] args) {
        DatabaseConnection mysql = new MySQLConnection();
        DatabaseConnection oracle = new OracleConnection();

        mysql.connect();
        mysql.executeQuery("SELECT * FROM users");

        oracle.connect();
        oracle.executeQuery("SELECT * FROM employees");
    }
}
