public class RenderContentVisitor implements Visitor {
    public AlignStrategy create(String textAlignment) {
        return new AlignmentStrategyFactor().create(textAlignment);
    }

    @Override
    public Object visit(Book book) {
        return null;
    }

    @Override
    public Object visit(Section section) {
        return null;
    }

    @Override
    public Object visit(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Object visit(Paragraph paragraph) {
        return null;
    }

    @Override
    public Object visit(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Object visit(Image image) {
        return null;
    }

    @Override
    public Object visit(Table table) {
        return null;
    }
}