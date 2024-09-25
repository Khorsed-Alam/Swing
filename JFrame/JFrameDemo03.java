package JFrame;

import javax.swing.*;

public class JFrameDemo03 extends JFrame{
    JFrameDemo03(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,200,500,500);
        setTitle("Demo O3");

    }

    public static void main(String[] args) {
       JFrameDemo03 frame= new JFrameDemo03();
        frame.setVisible(true);
    }
}
