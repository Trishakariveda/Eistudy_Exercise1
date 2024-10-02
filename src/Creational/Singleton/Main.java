package Creational.Singleton;

public class Main {

	public static void main(String[] args) {
	        // Only one instance of the database connection will be created
	        DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
	        DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();

	        System.out.println(connection1.getConnectionStatus());
	        System.out.println(connection2.getConnectionStatus());

	        System.out.println("Are both connections the same instance? " + (connection1 == connection2));
	    }
	}
