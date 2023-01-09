public class BookStatistics {
    private int numberOfImages;
    private int numberOfParagraphs;
    private int numberOfTables;

    public void visit(Image image) {
        numberOfImages++;
    }

    public void visit(ImageProxy imageProxy) {
        numberOfImages++;
    }

    public void visit(Paragraph paragraph) {
        numberOfParagraphs++;
    }

    public void visit(Table table) {
        numberOfTables++;
    }

    public void visit(TableOfContents tableOfContents) {
        numberOfTables++;
    }

    public void visit(Book book) {

    }

    public void printStatistics() {
        System.out.println("Book Statistics: ");
        System.out.println("Number of images: " + numberOfImages);
        System.out.println("Number of paragraphs: " + numberOfParagraphs);
        System.out.println("Number of tables: " + numberOfTables);
    }

    public void visit(Section section) {
        for(Element e : section.elements) {
            
        }
    }
}
