//GUI- Graphical User Interface
import javax.swing.JOptionPane;
public class GUI {
public static void main(String[] args){
String name= JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null,"Hello "+name);
int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
JOptionPane.showMessageDialog(null,"You are "+age+" years old");
double marks= Double.parseDouble(JOptionPane.showInputDialog("Enter your cet score"));
JOptionPane.showMessageDialog(null,"You scored "+marks+" marks");
}
}
