package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class CreateJLabel extends JFrame {
    private Container c;
    private JLabel userLable;

    CreateJLabel() {
        initComponents();
    }
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);

        userLable = new JLabel();
        userLable.setText("Enter Your User name");
        userLable.setBounds(40,040, 100,200);
        c.add(userLable);

    }
    public static void main(String[] args) {
        CreateJLabel frame= new CreateJLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 500,500);
        frame.setTitle("CreateJLabel");
        frame.setResizable(false);
    }


    
    }


    

