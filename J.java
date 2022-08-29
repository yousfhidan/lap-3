import javax.swing.*;
import javax.swing.JOptionPane;
public class J {


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "مرحبا انا اسمي هل");
        String r = JOptionPane.showInputDialog( "ماذا تريدني ان اعمل") ;
        String s = "yas";
        if (r != s) {

            JOptionPane.showMessageDialog(null, "انا اسف ");
        }
    }
}