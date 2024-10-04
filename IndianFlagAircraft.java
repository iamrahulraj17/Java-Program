import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IndianFlagAircraft extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.WHITE);

        // Draw the aircraft
        int[] xPoints = {150, 100, 120, 180, 200};
        int[] yPoints = {50, 150, 150, 150, 150};
        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, xPoints.length);

        // Draw the flag
        g.setColor(Color.ORANGE);
        g.fillRect(130, 80, 40, 10);
        g.setColor(Color.WHITE);
        g.fillRect(130, 90, 40, 10);
        g.setColor(Color.GREEN);
        g.fillRect(130, 100, 40, 10);

        // Draw the Ashoka Chakra
        g.setColor(Color.BLUE);
        g.drawOval(147, 90, 6, 6);

        // Draw the bottom rectangles
        g.setColor(Color.GRAY);
        g.fillRect(130, 150, 10, 30);
        g.fillRect(160, 150, 10, 30);

        // Draw the landing gear
        g.setColor(Color.BLACK);
        g.fillRect(132, 180, 6, 10);
        g.fillRect(162, 180, 6, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        IndianFlagAircraft panel = new IndianFlagAircraft();

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
