package _02_09_OTTOBRE._02_ABSTRACT_FACTORY;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape (String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
