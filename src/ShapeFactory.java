public class ShapeFactory {

    public Shape getShape(String shapeName){
        if (shapeName == "RECTANGLE"){
            return new Rectangle();
        } else if (shapeName == "SQUARE") {
            return new Square();
        }else{
            return new Circle();
        }
    }

}
