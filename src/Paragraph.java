public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignmentStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignmentStrategy) {
        this.alignmentStrategy = alignmentStrategy;
    }

    public void print() {
        System.out.println("Pharagraph: ");
        if(alignmentStrategy != null) {
            alignmentStrategy.render(this);
        } else {
            System.out.print(text + "\n");
        }
    }

    public String getText() {
        return text;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void get(int e) {

    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
