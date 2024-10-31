package lab4;
/**
 * Interface for points in Cartesian coordinates.
 * Provides methods for setting and getting x and y coordinates.
 */
public interface DecartPoint {
    /**
     * Sets the x-coordinate of the point.
     *
     * @param x the x-coordinate value to set
     */
    void setX(int x);
    /**
     * Sets the y-coordinate of the point.
     *
     * @param y the y-coordinate value to set
     */
    void setY(int y);
    /**
     * Retrieves the x-coordinate of the point.
     *
     * @return the x-coordinate of the point
     */
    int getX();
    /**
     * Retrieves the y-coordinate of the point.
     *
     * @return the y-coordinate of the point
     */
    int getY();
}

