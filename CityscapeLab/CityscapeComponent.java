import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int swh; 
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int lswitch)
    {
        swh = lswitch;
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Building b1 = new Building(0,0,swh);
        Building b2 = new Building(275,50,swh);
        Building b3 = new Building(450,75,swh);
        Building b4 = new Building(320,75,swh);
        Building b5 = new Building(320,75,swh);
        sun s1 = new sun(600,0);
        sun s2 = new sun(400,0);
        Street st1 = new Street(0,430);
        b1.draw(g2);
        b2.draw(g2);
        b3.draw(g2);
        b4.draw(g2);
        s1.draw(g2);
        s2.draw(g2);
        st1.draw(g2);
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
