package JFrame;

import javax.swing.*;

public class JFrameDemo02 extends JFrame {
    public static void main(String[] args) {
        JFrameDemo02 frame= new JFrameDemo02();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,600,600);
        frame.setTitle("Test -- Title");
    }
}
