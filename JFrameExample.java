import javax.swing.JFrame;
import javax.swing.JButton;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
