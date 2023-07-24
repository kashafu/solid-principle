package com.code.solid.dependency_inversion;

public class FilePrinter implements Printer {

    private Writer writer;

    public FilePrinter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void printValue(String value) {
        writer.writeValue(value);
    }
}
