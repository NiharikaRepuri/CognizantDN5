public class FactoryMethodPattern {
    public static void main(String[] args) {

        Document doc1 = DocumentFactory.createDocument("WORD");
        doc1.open();

        Document doc2 = DocumentFactory.createDocument("PDF");
        doc2.open();

        Document doc3 = DocumentFactory.createDocument("EXCEL");
        doc3.open();
    }
}

abstract class Document {
    abstract void open();
}

class WordDocument extends Document {
    @Override
    void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument extends Document {
    @Override
    void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument extends Document {
    @Override
    void open() {
        System.out.println("Opening Excel Document");
    }
}

class DocumentFactory {

    public static Document createDocument(String type) {

        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        }

        return null;
    }
}