package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class CreateMultipleJLabel extends JFrame {
    private Container c;
    private JLabel UserLabel;
    private JLabel UserPass;

    CreateMultipleJLabel(){
        initContainer();
    }
    public void initContainer(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

        JLabel UserLabel = new JLabel();
        UserLabel.setText("Enter Your UserName: ");
        UserLabel.setBounds(50,20,150,50);
        c.add(UserLabel);

        JLabel UserPass= new JLabel("Enter your Password: ");
        UserPass.setBounds(50,40,150,50);
        c.add(UserPass);



    }
    public static void main(String[] args) {

        CreateMultipleJLabel frame= new CreateMultipleJLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 500,500);
        frame.setTitle("CreateJLabel");
        frame.setResizable(false);
    }
}
