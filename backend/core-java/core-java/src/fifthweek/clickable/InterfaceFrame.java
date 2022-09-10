package fifthweek.clickable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * Create a frame that shapes can be added to. New shapes can be added to the
 * top panel by selecting an appropriate shape from the combo box, then clicking
 * the "Add Shape" button. Each shape can be moved around the top panel by
 * clicking and holding down the left mouse button. Alternatively, the shapes
 * can be double clicked on to present the user with a message.
 *
 * @author Mark Royer
 *
 */
public class InterfaceFrame extends JFrame implements ActionListener,
        MouseListener, MouseMotionListener {

    /**
     * For serializability.
     */
    private static final long serialVersionUID = -4868458690468681476L;

    /**
     * Location for the shapes to be drawn.
     */
    private JPanel drawingPanel;

    /**
     * A list of the currently displayed objects.
     */
    private Vector<ClickableShape> currentShapes;

    /**
     * Non-null if an object is currently being moved by the user.
     */
    private ClickableShape currentShape;

    /**
     * Used to add new shapes to the top panel.
     */
    private JButton addShapeButton;

    /**
     * A collection of shapes that may be created.
     */
    private JComboBox<ClickableShape> shapeComboBox;

    /**
     * The difference between where the user object's upper left hand corner is
     * and the original click of the mouse. This is used so that the object's
     * location won't immediately jump to where the mouse has clicked when
     * dragging the object around.
     */
    private Point offsetAmount;

    /**
     * Create a new <code>InterfaceFrame</code> with a top panel for
     * displaying shapes and a bottom panel containing a single button and a
     * JComboBox.
     */
    public InterfaceFrame() {

        currentShapes = new Vector<ClickableShape>();

        JSplitPane pane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

        // We'll redefine the paint method here even though it's not the most
        // flexible approach.
        drawingPanel = new JPanel() {
            /**
             *
             */
            private static final long serialVersionUID = -5252593241681515012L;

            /*
             * (non-Javadoc)
             *
             * @see javax.swing.JComponent#paint(java.awt.Graphics)
             */
            public void paint(Graphics g) {
                super.paint(g);

                // Draw with smoothing
                ((Graphics2D) g).setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                int offsetX, offsetY;
                int[] xs, newXs, ys, newYs;

                /*
                 * Redraw each Clickable shape
                 */
                for (ClickableShape shape : currentShapes) {

                    offsetX = shape.getLocation().x;
                    offsetY = shape.getLocation().y;

                    xs = shape.getXPoints();
                    ys = shape.getYPoints();
                    newXs = new int[xs.length];
                    newYs = new int[ys.length];

                    /*
                     * Draw each shape offset by its location
                     */
                    for (int i = 0; i < xs.length; i++) {
                        newXs[i] = xs[i] + offsetX;
                        newYs[i] = ys[i] + offsetY;
                    }

                    // Create the polygon shape
                    Polygon p = new Polygon(newXs, newYs,
                            shape.getXPoints().length);

                    // Draw the inside
                    g.setColor(shape.getFillColor());
                    g.fillPolygon(p);

                    // Draw the outline
                    g.setColor(shape.getOutlineColor());
                    g.drawPolygon(p);

                }
            }
        };

        drawingPanel.setBackground(Color.white);
        drawingPanel.addMouseListener(this);
        drawingPanel.addMouseMotionListener(this);

        pane.add(drawingPanel, JSplitPane.TOP);

        JPanel bottom = new JPanel();

        pane.add(bottom, JSplitPane.BOTTOM);

        addShapeButton = new JButton("Add Shape");
        addShapeButton.addActionListener(this);

        bottom.add(addShapeButton);

        shapeComboBox = new JComboBox<ClickableShape>();

        bottom.add(shapeComboBox);

        this.add(pane);
        this.pack();

        pane.setDividerLocation(300);
        pane.setEnabled(false);
        this.setTitle("Having fun with shapes!");
        this.setSize(600, 400);
        this.setResizable(false);
        this.validate();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Returns the top most object that contains the point or null if no object
     * contains the point. If an object contains the point, it will be moved to
     * the top of the pile.
     *
     * @param point
     *            where the mouse click occurred
     * @return an object that contains the point or null if no object contains
     *         the point
     */
    private ClickableShape getSelectedShape(Point point) {

        Point translatedPoint;

        ClickableShape shape;
        for (int i = currentShapes.size() - 1; i >= 0; i--) {
            shape = currentShapes.get(i);

            translatedPoint = new Point(point.x - shape.getLocation().x,
                    point.y - shape.getLocation().y);

            if (shape.contains(translatedPoint)) {
                currentShapes.remove(shape);
                currentShapes.add(shape);
                drawingPanel.repaint();
                return shape;
            }
        }

        return null;
    }

    /**
     * Move the given shape to a position relative to the given point.
     *
     * @param shape
     *            the shape that will be moved
     * @param p
     *            the new relative location
     */
    private void updatePosition(ClickableShape shape, Point p) {

        Point resultPoint = new Point(p.x - offsetAmount.x, p.y
                - offsetAmount.y);

        shape.moveTo(resultPoint);
        drawingPanel.repaint();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (addShapeButton.equals(source)) {

            Object selectedItem = shapeComboBox.getSelectedItem();

            // Was an item selected?
            if (selectedItem != null) {

                try {
                    // Create a new shape of the same type as selected
                    currentShapes.add((ClickableShape) selectedItem.getClass()
                            .newInstance());

                    drawingPanel.repaint();

                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                    System.exit(-1);
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                    System.exit(-1);
                }

            }
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    public void mouseClicked(MouseEvent e) {

        Object source = e.getSource();

        if (drawingPanel.equals(source)) {

            ClickableShape shape = getSelectedShape(e.getPoint());

            if (shape != null) {

                // Double click
                if (e.getClickCount() == 2) {
                    JOptionPane.showMessageDialog(this, shape.message());
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    public void mousePressed(MouseEvent e) {

        Object source = e.getSource();

        if (drawingPanel.equals(source)) {

            currentShape = getSelectedShape(e.getPoint());

            if (currentShape != null) {

                /*
                 * We set an offset amount so that it looks like the mouse
                 * pointer is stuck to the object at the place we initiated the
                 * drag.
                 */
                offsetAmount = new Point(e.getPoint().x
                        - currentShape.getLocation().x, e.getPoint().y
                        - currentShape.getLocation().y);
            }

        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    public void mouseReleased(MouseEvent e) {

        // No object selected now
        currentShape = null;
    }

    /**
     * Add a shape to the combo box in the window.
     *
     * @param shape
     *            the shape to add
     */
    public void addShape(ClickableShape shape) {
        this.shapeComboBox.addItem(shape);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
     */
    public void mouseDragged(MouseEvent e) {

        /*
         * We will set the position of the shape relative to the new position of
         * the mouse.
         */
        if (currentShape != null) {
            updatePosition(currentShape, e.getPoint());
        }

    }

    // These methods are required by the interfaces even though they are never
    // used.

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    public void mouseMoved(MouseEvent e) {
        // Do Nothing

    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    public void mouseEntered(MouseEvent e) {
        // Do Nothing
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    public void mouseExited(MouseEvent e) {
        // Do Nothing

    }

}
