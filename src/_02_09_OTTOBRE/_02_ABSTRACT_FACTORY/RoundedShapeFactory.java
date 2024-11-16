package _02_09_OTTOBRE._02_ABSTRACT_FACTORY;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape (String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
