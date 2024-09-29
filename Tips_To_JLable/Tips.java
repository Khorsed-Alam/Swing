package Tips_To_JLable;

import javax.swing.*;
import java.awt.*;

public class Tips extends JFrame {
    private Container c;
    private JLabel UserName;
    private JLabel UserPassword;
    private Font font;
    Tips(){
        initComponent();
    }
    public void initComponent(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        Font font= new Font("Arial", Font.ITALIC, 15);

        JLabel UserName=new JLabel();
        UserName.setText("Name: ");
        UserName.setBounds(100,100,100,50);
        UserName.setFont(font);
        UserName.setForeground(Color.black);
        UserName.setOpaque(true);
        UserName.setBackground(Color.WHITE);
        UserName.setToolTipText("Enter Your Name");
        c.add(UserName);

        JLabel UserPassword= new JLabel();
        UserPassword.setText("Password: ");
        UserPassword.setBounds(100,200,100,50);
        UserPassword.setFont(font);
        UserPassword.setForeground(Color.blue);
        UserPassword.setOpaque(true);
        UserPassword.setBackground(Color.WHITE);
        UserPassword.setToolTipText("Enter  Password : ");
        c.add(UserPassword);

    }

    public static void main(String[] args) {
        Tips tips=new Tips();
        tips.setVisible(true);
        tips.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tips.setBounds(200,200,400,400);
        tips.setBackground(Color.pink);
        tips.setTitle("Tips");

    }
}
