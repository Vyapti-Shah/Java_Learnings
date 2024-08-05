import javax.swing.JFrame;
import javax.swing.JButton;
public class ButtonMyFrame extends JFrame{
    ButtonMyFrame(){

        JButton button = new JButton();
        button.setBounds(200,100,100,50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                    
        this.setSize(500,500); 
        this.setLayout(null);//you have to state its x and y coordinate in a label.setBounds method or else it will display blank page(null)
        this.setVisible(true);
        this.add(button);
    }
}error
