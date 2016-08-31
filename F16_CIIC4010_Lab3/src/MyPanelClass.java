import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a flag
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height/5);
                        g.fillRect(x1, (int) (y1+(height*0.38)), width+1, height/4);
                        g.fillRect(x1, (int) (y1+(height*0.8)), width+1, (height/5)+1);
                        
                        //Draw a Triangle
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+18, y1+17, width-35, height-35);
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+36, y1+35, width-70, height-70);
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1, y2, x2, y1);
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((width-55)/2, (height-55)/2, 55, 55);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint(x1+200, y1 + (height/2));
                        p.addPoint(x1, y2);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 38, y1 + 90);
                        p2.addPoint(x1 + 54, y1 + 90);
                        p2.addPoint(x1 + 60, y1 + 75);
                        p2.addPoint(x1 + 66, y1 + 90);
                        p2.addPoint(x1 + 82, y1 + 90);
                        p2.addPoint(x1 + 69, y1 + 100);
                        p2.addPoint(x1 + 74, y1 + 115);
                        p2.addPoint(x1 + 60, y1 + 105);
                        p2.addPoint(x1 + 47, y1 + 115);
                        p2.addPoint(x1 + 51, y1 + 100);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}