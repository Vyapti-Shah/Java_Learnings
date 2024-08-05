import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class GUI2MyFrame extends JFrame {
   
    GUI2MyFrame() {
        this.setTitle("JFrame title goes here"); //this sets the title for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to exit when clicked on cross (x) button
                                                              // in place of EXIT_ON_CLOSE you can also put HIDE_ON_CLOSE which will hide when you click on cross (x) button 
                                                              // also in place of EXIT_ON_CLOSE you can put DO_NOTHING_ON_CLOSE which will hide when you click on cross (x) button 
        this.setResizable(false); //prevent frame from being resized                                                     
        this.setSize(500,500); //this sets the x-dimensions and y-dimensions of the frame
        this.setVisible(true); //make the frame visible

        ImageIcon image= new ImageIcon("images/vs.jpg"); //create an image icon
        this.setIconImage(image.getImage()); //change icon from frame
        this.getContentPane().setBackground(Color.black);
    }
}
