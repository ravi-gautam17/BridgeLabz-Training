package functionalinterfaces.dataformatutility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String standardFormat =
                DateFormatterUtil.formatDate(invoiceDate, "dd-MM-yyyy");

        String systemFormat =
                DateFormatterUtil.formatDate(invoiceDate, "yyyy/MM/dd");

        String customerFormat =
                DateFormatterUtil.formatDate(invoiceDate, "dd MMM yyyy");

        System.out.println("Invoice Date (Standard): " + standardFormat);
        System.out.println("Invoice Date (System): " + systemFormat);
        System.out.println("Invoice Date (Customer): " + customerFormat);
    }
}
