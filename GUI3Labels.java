import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

public class GUI3Labels {
    public static void main(String[] args) {

        Border border= BorderFactory.createLineBorder(Color.blue,3);

        //JLabel - a GUI display area for a string of text, an image or both 
        JLabel label=new JLabel(); //creates a label
        label.setText("Coding is amaizing"); //add text of label

        ImageIcon image= new ImageIcon("images/java.jpg");

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTRE, RIGHT of the image icon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTRE, BOTTOM of the image icon 
        label.setForeground(Color.white); //set font colour of text
        label.setFont(new Font("MV Bolie",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(50); //vertical gap between text and the image
        label.setBackground(Color.black); //set the background colour
        label.setOpaque(true); //display background colour (without this it will not change the background)
        label.setBorder(border); //set border for label and not for image or text
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within the label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within the label
        label.setBounds(0,0,600,500);// (x,y,width,height) //x and y are for positioning the frame and width and height are for dimensioning the layout

        JFrame frame=new JFrame();
        frame.setTitle("JFrame title "); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                    
        frame.setSize(800,500); 
        frame.setLayout(null);//you have to state its x and y coordinate in a label.setBounds method or else it will display blank page(null)
        frame.setVisible(true); 
        frame.add(label);
    //frame.pack(); //resizes the layout as per the size of the image //so no need of setBounds(line 31), setLayout(line 37) and setSize(line 36) //all the components should be written before and frame.pack() should be written at last
    }
}

