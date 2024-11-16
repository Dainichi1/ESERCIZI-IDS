package _01_08_OTTOBRE._02_FACTORY_METHOD;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Crea un'istanza di ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Ottieni un oggetto di tipo Circle e chiama il metodo draw
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // Output: Sto disegnando un cerchio

        // Ottieni un oggetto di tipo Rectangle e chiama il metodo draw
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();  // Output: Sto disegnando un rettangolo

        // Ottieni un oggetto di tipo Square e chiama il metodo draw
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();  // Output: Sto disegnando un quadrato
    }
}