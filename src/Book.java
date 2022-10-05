import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<String> paragraph;
    private List<String> image;
    private List<String> table;
    public Book(String disco_titanic) {
        name=disco_titanic;
        paragraph = new ArrayList<>();
        image = new ArrayList<>();
        table = new ArrayList<>();
    }

    public void createNewParagraph(String s) {
        paragraph.add(s);
    }

    public void createNewImage(String s) {
        image.add(s);
    }

    public void createNewTable(String s) {
        table.add(s);
    }

    public void print() {
        System.out.println("Book{" +
                "name='" + name + '\'' +
                ", paragraph='" + paragraph + '\'' +
                ", image='" + image + '\'' +
                ", table='" + table + '\'' +
                '}');
    }
}
