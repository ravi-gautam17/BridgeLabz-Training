package functionalinterfaces.dataexportfeature;

public class ReportingApp {

    public static void main(String[] args) {

        ReportExporter csvExporter = new CSVReportExporter();
        ReportExporter pdfExporter = new PDFReportExporter();
        ReportExporter jsonExporter = new JSONReportExporter();

        csvExporter.exportToCSV("Sales Report");
        csvExporter.exportToJSON("Sales Report");

        pdfExporter.exportToPDF("Invoice Report");
        pdfExporter.exportToJSON("Invoice Report");

        jsonExporter.exportToJSON("User Analytics");
    }
}
