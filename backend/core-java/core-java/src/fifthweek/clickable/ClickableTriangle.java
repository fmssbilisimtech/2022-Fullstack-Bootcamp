package fifthweek.clickable;

import java.awt.Color;
import java.awt.Point;

/**
 * Creates a new triangle that can be clicked on. This particular triangle is
 * made up of the points: { (0,0), (100,150), (200,0) }. The inside of the
 * triangle is red and the outline of the triangle is black.
 *
 * An important point to make, is that the triangle will appear pointing
 * downwards because the Java y-axis is in the opposite direction compared to
 * the usual convention of having y increase as one travels upward.
 *
 * @author Mark Royer
 *
 */
public class ClickableTriangle implements ClickableShape {

    /**
     * The current location of the of the upper-left hand corner of the triangle
     */
    private Point location;

    /**
     * The bottom point of the triangle - x position
     */
    private static final int MIDX = 100;

    /**
     * The right most point of the triangle - x position
     */
    private static final int MAXX = 200;

    /**
     * The bottom point of the triangle - y position
     */
    private static final int MAXY = 150;

    /**
     * Create a new <code>ClickableTriangle</code> at the origin.
     */
    public ClickableTriangle() {
        location = new Point(0, 0);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * edu.umaine.cs.interfaceExample.ClickableShape#contains(java.awt.Point)
     */
    public boolean contains(Point point) {

        int x = point.x;
        int y = point.y;

        /*
         * For the x dimension we know that x must be between the minimum and
         * maximum values.
         */
        if (0 <= x && x <= MAXX) {

            /*
             * For the y dimension we have two cases. 1. that x is before the
             * bottom midpoint, or 2. that x is after the bottom midpoint. For
             * either case, we know y must be greater than the minimum y value.
             * We also know that y must be less than an equation of the form y =
             * m*x+b. We use the x value to find the maximum y value, y must be
             * below.
             */
            if (x <= MIDX) {

                // y = m*x + b, b=0, because the line goes through the local
                // origin.
                if (0 <= y && y <= 1.5 * point.x) {
                    return true;
                }

            } else { // x > MIDX

                // In this case b = MAXY*2
                if (0 <= y && y <= -1.5 * point.x + MAXY * 2) {
                    return true;
                }
            }
        }

        return false; // The triangle did not contain the point
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#getFillColor()
     */
    public Color getFillColor() {
        return Color.red;
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#getLocation()
     */
    public Point getLocation() {
        return location;
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#getOutlineColor()
     */
    public Color getOutlineColor() {
        return Color.black;
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#getXPoints()
     */
    public int[] getXPoints() {
        return new int[] { 0, MIDX, MAXX };
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#getYPoints()
     */
    public int[] getYPoints() {
        return new int[] { 0, MAXY, 0 };
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#message()
     */
    public String message() {
        return "You double clicked the triangle!";
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.umaine.cs.interfaceExample.ClickableShape#moveTo(java.awt.Point)
     */
    public void moveTo(Point point) {
        location = point;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Triangle";
    }

}
