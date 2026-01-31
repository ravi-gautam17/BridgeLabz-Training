package methodreferences.invoiceobjectcreation;

import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerationDemo {

    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(1001, 1002, 1003, 1004);

        // 🔹 Constructor reference used here
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)      // constructor reference
                .collect(Collectors.toList());

        // Print invoices
        invoices.forEach(System.out::println);
    }
}
