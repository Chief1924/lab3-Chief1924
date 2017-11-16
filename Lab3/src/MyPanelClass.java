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
                        g.setColor(Color.GREEN);
                        g.fillRect(x1, y1, x2 + 1, y2 + 1);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1 + 10, y1 + 10, x1 + 210, y1 + 140);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 + 10, y1 + 38, x1 + 210, y1 + 28);
                        g.fillRect(x1 + 10, y1 + 95, x1 + 210, y1 + 28);

                        Polygon p = new Polygon();
                        p.addPoint(x1 + 10, y1 + 10);
                        p.addPoint(x1 + 10, y1 + 150);
                        p.addPoint(x1 + 115, y1 + 80);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 + 10, y1 + 10, x1 + 210, y1 + 140);
                        
            }
}