package Fontsize_Style_of_JLabel;

import javax.swing.*;
import java.awt.*;

public class FontDemo extends JFrame {
    private Container c;
    private JLabel Username;
    private  JLabel UserPass;
    private Font font;
    FontDemo (){
        initComponent();
    }
    public void initComponent(){

        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        Font font = new Font("Arial",Font.BOLD,14);


        JLabel Username=new JLabel();
        Username.setText("Enter Your Name :");
        Username.setBounds(50,30,150,40);
        Username.setFont(font);
        c.add(Username);


        JLabel UserPass =new JLabel();
        UserPass.setText("Enter your password: ");
        UserPass.setBounds(50,50,200,40);
        UserPass.setFont(font);
        c.add(UserPass);

    }

    public static void main(String[] args) {
        FontDemo fontDemo= new FontDemo();
        fontDemo.setVisible(true);
        fontDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fontDemo.setBounds(200,200, 400,400);
        fontDemo.setTitle("Font Style");
        fontDemo.setResizable(false);
    }

}
