package CreateJTextField;

import javax.swing.*;
import java.awt.*;

public class jTextField extends JFrame {
    private Container container;
    private JTextField textField;
    private JTextField textField1;

    jTextField(){
        initComponent();
    }
    public void initComponent(){
        container= this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);

         textField=new JTextField("Name");
        textField.setBounds(50,50,200,50);
        container.add(textField);

        textField1 =new JTextField("Password: ");
        textField1.setBounds(50,110,200,50);
        container.add(textField1);
    }

    public static void main(String[] args) {
        jTextField textField2= new jTextField();
        textField2.setVisible(true);
        textField2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField2.setBounds(200,200,500,500);
        textField2.setTitle("Create JTextField");
        textField2.setResizable(false);
    }
}
