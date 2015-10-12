import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;


/**
 * Write a description of class Street here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Street
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Street
     */
    public Street(int x, int y)
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
        Rectangle structure = new Rectangle(xLeft ,yTop +40,800,100);
        g2.draw(structure);
        g2.setColor(Color.BLACK);
        g2.fill(structure);
        for( int markLeft = xLeft + 2; markLeft < yTop+390; markLeft += 25 )
        {
            Rectangle mark = new Rectangle(markLeft ,yTop +82,15,20);
            g2.draw(mark);
            g2.setColor(Color.YELLOW);
            g2.fill(mark);
        }
    }     
}
