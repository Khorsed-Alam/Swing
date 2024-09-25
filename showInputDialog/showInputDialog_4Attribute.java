package showInputDialog;

import javax.swing.*;

public class showInputDialog_4Attribute {
    public static void main(String[] args) {
        String F_name= JOptionPane.showInputDialog(null, "enter your name: ", "Title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null , "Your name "+F_name, "Output",JOptionPane.QUESTION_MESSAGE);
    }
}

