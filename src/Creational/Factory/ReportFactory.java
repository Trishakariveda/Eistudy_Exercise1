package Creational.Factory;

public class ReportFactory {
	public static Report getReport(String reportType) {
        switch (reportType) {
            case "PDF":
                return new PdfReport();
            case "HTML":
                return new HtmlReport();
            default:
                throw new IllegalArgumentException("Unknown report type");
        }
    }
}
