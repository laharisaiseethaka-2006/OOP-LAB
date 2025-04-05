abstract class DatabaseConnection {
    abstract void connectToDatabase();
}
interface QueryExecutor {
    void executeQuery(String query);
}
class MySQLConnection extends DatabaseConnection implements QueryExecutor {
    void connectToDatabase() {
        System.out.println("Connecting to MySQL database...");
    }
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

public class Data {
    public static void main(String[] args) {
        MySQLConnection mySQL = new MySQLConnection();
        mySQL.connectToDatabase();
        mySQL.executeQuery("SELECT * FROM users;");
    }
}