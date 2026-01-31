package functionalinterfaces.dataexportfeature;

public interface ReportExporter {

    // Existing abstract methods
    void exportToCSV(String data);
    void exportToPDF(String data);

    // New feature added later (default method)
    default void exportToJSON(String data) {
        System.out.println("JSON export is not supported by this exporter.");
    }
}
