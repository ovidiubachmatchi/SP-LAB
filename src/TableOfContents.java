public class TableOfContents implements Element {
    public void print() {
        System.out.println("TableOfContents");
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
