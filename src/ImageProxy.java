public class ImageProxy implements Element {
    private String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    private Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
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
