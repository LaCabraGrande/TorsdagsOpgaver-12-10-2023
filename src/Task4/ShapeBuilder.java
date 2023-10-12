package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shape;

    public ShapeBuilder() {
        shape = new ArrayList<Shape>();
    }

    public void addShape(Shape s) {
        shape.add(s);
    }
    public double getTotalAreal() {
        double totalAreal = 0.0;
        for (Shape s : shape) {
            totalAreal += s.getArea();
        }
        return totalAreal;
    }
}


