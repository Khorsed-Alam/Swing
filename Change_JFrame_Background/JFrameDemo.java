package Change_JFrame_Background;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame {
    private ImageIcon icon ;
    private Container container;

     JFrameDemo (){
        initComponent();
    }
    public void initComponent(){
        container= this.getContentPane();
        container.setBackground(Color.CYAN);

        icon = new ImageIcon(getClass().getResource("/Change_JFrame_Background/J.png"));
        this.setIconImage(icon.getImage());

    }

    public static void main(String[] args) {
        JFrameDemo frame= new JFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,400);
        frame.setTitle("Background change");
        frame.setResizable(false);
    }

}
