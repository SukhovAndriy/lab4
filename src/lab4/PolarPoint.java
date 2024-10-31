package lab4;
/**
 * Interface for points in polar coordinates.
 * Provides methods for setting radius (ro) and angle (phi).
 */
public interface PolarPoint {
    /**
     * Sets the radius (distance from origin) in polar coordinates.
     *
     * @param ro the radius value to set
     */
    void setRo(double ro);
    /**
     * Sets the angle (in degrees) in polar coordinates.
     *
     * @param phi the angle value to set
     */
    void setPhi(double phi);
}

