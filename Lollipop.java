
/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** Draws pictures on the graphics pane
 */
public class Lollipop{
    
    
    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /** Draw a lollipop at (300, 180) asking the user for its size */
    public void doDrawLollipop(){
        double diameter = UI.askDouble("Diameter: ");
        drawLollipop(300, 180, diameter, 200);
        drawLollipop(50, 60, diameter/2.0, 90);
        drawLollipop(400, 100, diameter, 70);
    }
    
    /** Draws a red lollipop on a stick */
    private void drawLollipop(double x, double y, double size, double stick){
        double left = x-size/2.0;           // left of lollipop
        double top = y-size/2.0;            // top of lollipop
        double bottom = y+stick;            // bottom of stick
        
        UI.setColor(Color.black);           // set color of stick
        UI.setLineWidth(size/8.0);          // set line width to 10
        UI.drawLine(x, y, x, bottom);       // draw line    (300,200) to (300, 400)
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(left, top, size, size);      // fill oval    @(260, 160), 80x80
    }

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

