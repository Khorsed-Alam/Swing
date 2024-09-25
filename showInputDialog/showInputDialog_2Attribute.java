package showInputDialog;

import javax.swing.*;

public class showInputDialog_2Attribute {
    public static void main(String[] args) {
        String F_name= JOptionPane.showInputDialog("Enter your name: ", "Name");
        JOptionPane.showMessageDialog(null , "Hello "+F_name);

    }
}
