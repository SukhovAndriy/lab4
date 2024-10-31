package lab4;
/**
 * Represents a circle that can be drawn using polar coordinates.
 * Requires a PolarPoint as the center for drawing.
 */
public class Circle {
    /** The center of the circle in polar coordinates. */
    private PolarPoint center;
    /**
     * Constructs a Circle with the specified center.
     *
     * @param center the center point of the circle in polar coordinates
     */
    public Circle(PolarPoint center) {
        this.center = center;
    }
    /**
     * Draws the circle by setting its center's polar coordinates.
     *
     * @param ro the radius from origin for the circle's center
     * @param phi the angle for the circle's center
     */
    public void draw(double ro, double phi) {
        center.setRo(ro);
        center.setPhi(phi);
        System.out.println("Circle drawn at polar coordinates: (ro=" + ro + ", phi=" + phi + ")");
    }
}

