package Creational.Singleton;

public class DatabaseConnectionManager {
	private static DatabaseConnectionManager instance;
    private String connection;

    private DatabaseConnectionManager() {
        // Private constructor to prevent instantiation from outside
        connection = "Connected to database!";
    }

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public String getConnectionStatus() {
        return connection;
    }
}
