import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * creates a building object
 * 
 * @author putman
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int lswitch;
    public Building(int x, int y, int swh)
    {
        xLeft = x;
        yTop = y;
        swh = lswitch; 
    }
    public void draw(Graphics2D g2)
    {   
        Rectangle structure = new Rectangle(xLeft +100,yTop +70,100,400);
        g2.draw(structure);
        g2.setColor(Color.GRAY);
        g2.fill(structure);
        
        
        for( int paneTop = yTop + 2; paneTop < yTop+390; paneTop += 25 )
        {
            Rectangle pane = new Rectangle(xLeft +105,paneTop +70,15,20);
            g2.draw(pane);
        
            g2.setColor(Color.YELLOW);
            g2.fill(pane);
        }
         for( int paneTop = yTop + 2; paneTop < yTop+390; paneTop += 25 )
        {
            Rectangle pane = new Rectangle(xLeft +129,paneTop +70,15,20);
            g2.draw(pane);
            g2.setColor(Color.YELLOW);
            g2.fill(pane);
        }
         for( int paneTop = yTop + 2; paneTop < yTop+390; paneTop += 25 )
        {
            Rectangle pane = new Rectangle(xLeft +154,paneTop +70,15,20);
            g2.draw(pane);
            g2.setColor(Color.YELLOW);
            g2.fill(pane);
        }
         for( int paneTop = yTop + 2; paneTop < yTop+390; paneTop += 25 )
        {
            Rectangle pane = new Rectangle(xLeft +179,paneTop +70,15,20);
            g2.draw(pane);
            g2.setColor(Color.YELLOW);
            g2.fill(pane);
        }
    }
    
}
    