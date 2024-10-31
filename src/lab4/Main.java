package lab4;
/**
 * Main class to test the Adapter pattern implementation.
 */
public class Main {
    /**
     * Main method to test the adapter functionality by drawing a circle with a Cartesian point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        DecartPoint point = new Point(0, 0);
        PolarPoint polarAdapter = new Adapter(point);
        Circle circle = new Circle(polarAdapter);
        circle.draw(15, 45);
    }
}

