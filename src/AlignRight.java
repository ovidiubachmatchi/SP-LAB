public class AlignRight implements AlignStrategy {
    public void render(Paragraph p) {
        System.out.print("++++++"+p.getText() + "\n");
    }
}
