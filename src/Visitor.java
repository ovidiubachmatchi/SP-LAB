public interface Visitor<T> {
    T visit(Book book);
    T visit(Section section);
    T visit(TableOfContents tableOfContents);
    T visit(Paragraph paragraph);
    T visit(ImageProxy imageProxy);
    T visit(Image image);
    T visit(Table table);
}