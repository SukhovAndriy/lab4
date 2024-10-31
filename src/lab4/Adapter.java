package lab4;
/**
 * Adapter class that converts a DecartPoint to be used as a PolarPoint.
 * Adapts Cartesian coordinates to polar coordinates without modifying the original interface.
 */
public class Adapter implements PolarPoint {
    /** The DecartPoint instance to be adapted to polar coordinates. */
    private DecartPoint point;
    /**
     * Constructs an Adapter for a given DecartPoint.
     *
     * @param point the DecartPoint to adapt
     */
    public Adapter(DecartPoint point) {
        this.point = point;
    }

    @Override
    public void setRo(double ro) {
        int x = (int) (ro * Math.cos(Math.toRadians(point.getX())));
        int y = (int) (ro * Math.sin(Math.toRadians(point.getY())));
        point.setX(x);
        point.setY(y);
    }
    @Override
    public void setPhi(double phi) {
        double ro = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
        int x = (int) (ro * Math.cos(Math.toRadians(phi)));
        int y = (int) (ro * Math.sin(Math.toRadians(phi)));
        point.setX(x);
        point.setY(y);
    }
}
