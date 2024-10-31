package lab4;
/**
 * Implementation of a point in Cartesian coordinates.
 * Stores x and y coordinates as integer values.
 */
public class Point implements DecartPoint {
    /** The x-coordinate of the point.*/
    private int x;
    /** The y-coordinate of the point. */
    private int y;
    /**
     * Constructs a Point with specified x and y coordinates.
     *
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public int getY() {
        return y;
    }
}
