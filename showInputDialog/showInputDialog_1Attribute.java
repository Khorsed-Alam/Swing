package showInputDialog;

import javax.swing.*;

public class showInputDialog_1Attribute {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("Enter you name: ");
        JOptionPane.showMessageDialog(null , "Welcome "+name);

    }
}
