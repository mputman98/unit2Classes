import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class sun
     */
    public sun(int x,int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)   
    {
       Ellipse2D.Double sun = new Ellipse2D.Double(xLeft +10, yTop +10,80,80); 
       g2.draw(sun);
       g2.setColor(Color.YELLOW);
       g2.fill(sun);
        
    }

}
