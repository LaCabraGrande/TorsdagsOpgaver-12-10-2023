package Task4;

public class Main {
    ShapeBuilder shapebuilder;

    public static void main(String[] args) {

        ShapeBuilder shapebuilder = new ShapeBuilder();
        shapebuilder.addShape(new Circle(3.5));
        shapebuilder.addShape(new Square(4.5));
        shapebuilder.addShape(new Circle(2.5));
        shapebuilder.addShape(new Square(5.5));
        System.out.println("Totalt areal: " + shapebuilder.getTotalAreal());
    }
}

