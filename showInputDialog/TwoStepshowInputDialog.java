package showInputDialog;

import javax.swing.*;

public class TwoStepshowInputDialog {
    public static void main(String[] args) {
        String F_Name= JOptionPane.showInputDialog(null , "Enter your name: ", "Input Page 1",JOptionPane.INFORMATION_MESSAGE);
        String L_Name= JOptionPane.showInputDialog( null , "Enter your Name: ", "Input page 2",JOptionPane.INFORMATION_MESSAGE);
        String name= F_Name+ L_Name;
        JOptionPane.showMessageDialog(null,"Your Full Name: "+name);
    }
}
