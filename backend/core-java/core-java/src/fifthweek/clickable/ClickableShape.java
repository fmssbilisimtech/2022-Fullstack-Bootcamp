package fifthweek.clickable;

import java.awt.Color;
import java.awt.Point;

/**
 * Represents a shape object that can be dragged around by the mouse and double
 * clicked on. This particular shape must be a contiguous polygon.
 *
 * @author Mark Royer
 *
 */
public interface ClickableShape {

    /**
     * This should be the origin of the local shape's layout. Remember that the
     * y-axis points down instead of up.
     *
     * @return The current location of the shape
     */
    public Point getLocation();

    /**
     * @return The x points that make up the shape in counter-clockwise order
     */
    public int[] getXPoints();

    /**
     * Note that these should pair with the XPoints.
     *
     * @return The y points that make up the shape in counter-clockwise order
     */
    public int[] getYPoints();

    /**
     * @return The current shape's perimeter color
     */
    public Color getOutlineColor();

    /**
     * @return The color of the inside of the shape
     */
    public Color getFillColor();

    /**
     * @param point
     *            A point on the screen that has been translated to the shape's
     *            local coordinate system. For example, if the shape is at
     *            (20,30) on the screen and the user clicks at point (30, 40),
     *            then the point that will be passed to the method should be
     *            (10,10). The given point is relative to the shape's local
     *            coordinate system.
     *
     * @return true iff the point is contained in the shape
     */
    public boolean contains(Point point);

    /**
     * Make the current location set to the given point.
     *
     * @param point
     *            A location for the shape to be rendered at
     */
    public void moveTo(Point point);

    /**
     * @return A message to give to the user when the shape is double clicked on
     */
    public String message();

    /**
     * @return A simple name that describes the shape
     */
    public String toString();

}