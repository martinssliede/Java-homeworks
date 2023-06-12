package io.codelex.oop.summary.Exercise2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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

    private double calculateSubtotal() {
        double sum = 0.0;
        List<Item> items = order.getItems();
        for (SellableThing item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    private double calculateVAT() {
        return calculateSubtotal() * VAT_RATE;
    }

    private double calculateTotal() {
        return calculateSubtotal() + calculateVAT();
    }

    public String getFormattedInvoice() {
        DecimalFormat format = new DecimalFormat("#.00");
        StringBuilder builder = new StringBuilder();
        builder.append("===================================================\n");
        builder.append("= INVOICE NUMBER: " + invoiceNumber + "                          =\n");
        builder.append("= STATUS: " + status + "                                =\n");
        builder.append(order.getItemsList());
        builder.append("= SUM: " + format.format(calculateSubtotal()) + " EUR" + "                                  =\n");
        builder.append("= VAT (21%): " + format.format(calculateVAT()) + " EUR" + "                             =\n");
        builder.append("= TOTAL: " + format.format(calculateTotal()) + " EUR" + "                                =\n");
        builder.append("===================================================\n");
        return builder.toString();
    }
}
