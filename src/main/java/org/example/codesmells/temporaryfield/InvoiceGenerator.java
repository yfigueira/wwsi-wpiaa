package org.example.codesmells.temporaryfield;

public class InvoiceGenerator {
    public void generateInvoice() {
        var invoiceNumber = 12345;
        var pdfWriter = new PdfWriter("Invoice_%d.pdf".formatted(invoiceNumber));

        pdfWriter.write("Invoice content");
        pdfWriter.close();
    }

    public void otherMethod() {
        // ...
    }
}
