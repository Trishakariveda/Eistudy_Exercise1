package Creational.Factory;

import java.util.Scanner;

public class Main1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter report type (PDF/HTML): ");
	        String reportType = scanner.nextLine().toUpperCase();

	        try {
	            Report report = ReportFactory.getReport(reportType);
	            report.generate();
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}
