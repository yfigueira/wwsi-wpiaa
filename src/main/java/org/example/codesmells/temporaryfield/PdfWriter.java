package org.example.codesmells.temporaryfield;

public class PdfWriter {

    private final String path;

    public PdfWriter(String path) {
        this.path = path;
    }

    public void write(String content) {
        System.out.println(content);
    }

    public void close() {
        // closing
    }
}
