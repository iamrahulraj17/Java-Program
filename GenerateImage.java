import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class GenerateImage {
  public static void main(String[] args) {
    // Create a new image with a width and height of 400x400 pixels
    BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

    // Get the graphics object for the image
    Graphics2D g2d = image.createGraphics();

    // Set the background color to white
    g2d.setColor(Color.WHITE);
    g2d.fillRect(0, 0, 400, 400);

    // Draw a red circle in the center of the image
    g2d.setColor(Color.RED);
    g2d.fillOval(175, 175, 50, 50);

    // Draw a blue rectangle in the top-left corner of the image
    g2d.setColor(Color.BLUE);
    g2d.fillRect(50, 50, 100, 100);

    // Draw a green line from the top-left to the bottom-right of the image
    g2d.setColor(Color.GREEN);
    g2d.drawLine(0, 0, 400, 400);

    // Dispose of the graphics object
    g2d.dispose();

    // Save the image to a file
    try {
      File outputfile = new File("image.png");
      ImageIO.write(image, "png", outputfile);
    } catch (IOException e) {
      System.out.println("Error saving image: " + e.getMessage());
    }
  }
}