import java.util.List;

public interface Element extends Visitee {
    void print();
    void add(Element e);
    void remove(Element e);
    void get(int e);
    void Accept(Visitor visitor);
}
