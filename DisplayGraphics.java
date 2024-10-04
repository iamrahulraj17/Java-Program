import java.awt.*;  
import javax.swing.JFrame;  
  
public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) { 
        //Text
        g.setColor(Color.RED);
        g.drawString("This Aircraft is made by Raj Kushwaha",400,350);  
        
        //Aircraft layout
        g.setColor(Color.BLACK);
        g.drawLine(500, 100, 300, 400);//l1
        g.drawLine(500, 100, 700, 400);//l2

        g.drawLine(300, 400, 350, 500);//l3
        g.drawLine(700, 400, 650, 500);//l4

        g.drawLine(350, 500, 400, 400);//l5
        g.drawLine(650, 500, 600, 400);//l6

        g.drawLine(400, 400, 440, 400);//l7
        g.drawLine(600, 400, 560, 400);//l8

        g.drawLine(440, 400, 440, 480);//l9
        g.drawLine(560, 400, 560, 480);//l10

        g.drawLine(440, 480, 480, 480);//l11
        g.drawLine(560, 480, 520, 480);//l12
          
        g.drawLine(480, 480, 480, 400);//l13
        g.drawLine(520, 480, 520, 400);//l14

        g.drawLine(480, 400, 520, 400);//l15

        g.drawLine(449, 199, 550, 199);//flag l1
        g.drawLine(550, 199, 550, 290);//flag l2
        g.drawLine(550, 290, 449, 290);//flag l3
        g.drawLine(449, 290, 449, 199);//flag l4

        //fire
        g.setColor(Color.RED);//left
        g.drawLine(450, 480, 445, 530);
        g.drawLine(460, 480, 460, 530);
        g.drawLine(470, 480, 475, 530);

        g.setColor(Color.RED);//right
        g.drawLine(530, 480, 525, 530);
        g.drawLine(540, 480, 540, 530);
        g.drawLine(550, 480, 555, 530);

        //flag
        g.setColor(Color.ORANGE);//flag orange
        g.fillRect(450, 200, 100, 30);

        g.setColor(Color.BLUE);//flag circle
        g.drawOval(485, 230, 30, 30);

        g.setColor(Color.GREEN);//flag green
        g.fillRect(450, 260, 100, 30);

        g.setColor(Color.BLUE);//flag spokes
        g.drawLine(500, 230, 500, 260);
        g.drawLine(510, 235, 490, 255);
        g.drawLine(515, 245, 485, 245);
        g.drawLine(510, 255, 490, 235);
    }  
        public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(1080,720);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}  