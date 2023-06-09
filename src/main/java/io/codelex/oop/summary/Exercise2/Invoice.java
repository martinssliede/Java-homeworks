package io.codelex.oop.summary.Exercise2;

public class Invoice {
    private static final double VAT_RATE = 0.21;

    private Order order;
    private String invoiceNumber;
    private InvoiceStatus status;
    private double total;
    private double vat;

    public Invoice(Order order, String invoiceNumber) {
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }


}
