import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class GUI2 {
    public static void main (String[] args){
        //JFrame- a GUI window to add component
        JFrame frame=new JFrame(); //create a frame
        frame.setTitle("JFrame title goes here"); //this sets the title for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to exit when clicked on cross (x) button
                                                              // in place of EXIT_ON_CLOSE you can also put HIDE_ON_CLOSE which will hide when you click on cross (x) button 
                                                              // also in place of EXIT_ON_CLOSE you can put DO_NOTHING_ON_CLOSE which will hide when you click on cross (x) button 
        frame.setResizable(false); //prevent frame from being resized                                                     
        frame.setSize(500,500); //this sets the x-dimensions and y-dimensions of the frame
        frame.setVisible(true); //make the frame visible

        ImageIcon image= new ImageIcon("images/vs.jpg"); //create an image icon
        frame.setIconImage(image.getImage()); //change icon from frame
        frame.getContentPane().setBackground(Color.black); //for background colour
                                                           // for rgb colour input write - setBackground(new Colour(0,0,0)) this will give black background
                                                           //(255,255,255) will give white colour
                                                           //(255,0,0) will give red colour
                                                           //(0,255,0) will give green colour
                                                           //(0,0,255) will give blue colour  
                                                           //(0*FFFFFF) hexadecimal value gives white colour    
                                                             
    }
}
