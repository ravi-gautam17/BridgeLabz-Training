package methodreferences.invoiceobjectcreation;

class Invoice {
    int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice generated for Transaction ID: " + transactionId;
    }
}
