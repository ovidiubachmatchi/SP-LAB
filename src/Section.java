import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    List<Element> elements;
    String title;

    public Section(String s) {
        title = s;
        elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element e : elements) {
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public void get(int e) {
        elements.get(e);
    }

    public void accept(BookStatistics stats) {
        stats.visit(this);
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
