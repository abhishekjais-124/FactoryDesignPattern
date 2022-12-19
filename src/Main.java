public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj1 = shapeFactory.getShape("SQUARE");
        obj1.draw();
        Shape obj2 = shapeFactory.getShape("RECTANGLE");
        obj2.draw();
    }
}