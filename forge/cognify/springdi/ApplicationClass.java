package forge.cognify.springdi;

public class ApplicationClass {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.setShape(new Circle());
        drawing.drawShape();

    }
}
