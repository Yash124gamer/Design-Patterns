public class ShapeFactory{

    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shape.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        return null;
    }
}