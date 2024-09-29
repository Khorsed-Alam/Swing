package Foreground_and_Background_Color_of_JLabel;

import javax.swing.*;
import java.awt.*;

public class Foreground_and_BackGround extends JFrame{
    private Container c;
    private JLabel UserName;
    private JLabel UserPassword;
    private Font font;

    Foreground_and_BackGround(){
        initComponent();
    }
    public void initComponent(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        font= new Font("Arial",Font.ITALIC,13);


        JLabel userName=new JLabel();
        userName.setText("Enter Your Name: ");
        userName.setBounds(50,20,300,50);
        userName.setFont(font);
        userName.setForeground(Color.black);
        userName.setOpaque(true);
        userName.setBackground(Color.blue);
        c.add(userName);

        JLabel userPass= new JLabel();
        userPass.setText("Enter Your Password:");
        userPass.setBounds(50,70,300,50 );
        userPass.setFont(font);
        userPass.setForeground(Color.RED);
       userPass.setOpaque(true);
        userPass.setBackground(Color.WHITE);
        c.add(userPass);

    }

    public static void main(String[] args) {
        Foreground_and_BackGround foregroundAndBackGround=new Foreground_and_BackGround();
        foregroundAndBackGround.setVisible(true);
        foregroundAndBackGround.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        foregroundAndBackGround.setBounds(200,200,600,600);
        foregroundAndBackGround.setTitle("Foreground and Background ");
        foregroundAndBackGround.setResizable(false);
    }
}
