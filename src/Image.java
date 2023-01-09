import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image with name: "+imageName);
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
