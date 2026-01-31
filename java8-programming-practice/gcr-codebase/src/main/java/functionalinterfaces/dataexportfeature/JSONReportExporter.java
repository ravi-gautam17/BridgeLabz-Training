package functionalinterfaces.dataexportfeature;

public class JSONReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV export not supported in JSON exporter.");
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF export not supported in JSON exporter.");
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting data to JSON: " + data);
    }
}

