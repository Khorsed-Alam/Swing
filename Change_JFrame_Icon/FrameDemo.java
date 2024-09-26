package Change_JFrame_Icon;

import javax.swing.*;

public class FrameDemo extends JFrame {
    //private ImageIcon icon ;
    FrameDemo(){
        initComponent();
    }
    public void initComponent(){
        ImageIcon icon= new ImageIcon(getClass().getResource("/Change_JFrame_Icon/Icon.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        FrameDemo frame= new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 600,600);
        frame.setTitle("Set Icon");
        frame.setResizable(false);
    }

}
