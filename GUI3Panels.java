import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUI3Panels {
    public static void main(String[] args) {

        ImageIcon icon= new ImageIcon("images/money.jpg");

        JLabel label=new JLabel();
        label.setText("Vyapti Shah");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);


        JPanel pinkPanel=new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(0,0,250,250);
        pinkPanel.setLayout(new BorderLayout());


        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel lightbluePanel=new JPanel();
        lightbluePanel.setBackground(Color.cyan);
        lightbluePanel.setBounds(0,250,500,250);
        lightbluePanel.setLayout(new BorderLayout());

        JFrame frame=new JFrame();
        frame.setTitle("JFrame title "); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                    
        frame.setSize(800,500); 
        frame.setLayout(null);//you have to state its x and y coordinate in a label.setBounds method or else it will display blank page(null)
        frame.setVisible(true); 
        pinkPanel.add(label);//first it pastes the label in pink
        bluePanel.add(label);//then it takes the label from the pinkPanel to bluePanel //so if the bluePanel gets null then there would be nothing pasted and it will be blank
        frame.add(pinkPanel);
        frame.add(bluePanel);
        frame.add(lightbluePanel);
      
        
    }
}
