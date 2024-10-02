package Creational.Singleton;

public class SingletonTest1 {
	  public static void main(String[] args) {
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();
	        
	        if (logger1 == logger2) {
	            System.out.println("Singleton Test Passed: Both instances are the same.");
	        } else {
	            System.out.println("Singleton Test Failed: Different instances were created.");
	        }
	    }
	}