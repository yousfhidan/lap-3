import javax.swing.*;
import javax.swing.JOptionPane;
public class H {


    public static void main(String[] args) {
        String name;
       name= JOptionPane.showInputDialog("What is your name :");
        System.out.println(name);
        JOptionPane.showMessageDialog(null,"HI,your name is:"+name);
    }
}
