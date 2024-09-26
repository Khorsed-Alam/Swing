package showMessageDialog_5Parameter;

import javax.swing.*;

public class showMessageDialog {
    public static void main(String[] args) {
        ImageIcon img= new ImageIcon("showMessageDialog_5Parameter/Error.png");
        JOptionPane.showMessageDialog(null , "Wrong Password","Warning",JOptionPane.ERROR_MESSAGE,img);

    }
}
