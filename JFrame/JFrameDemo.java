package JFrame;

import javax.swing.*;

public class JFrameDemo{
    public static void main(String[] args) {
        // create JFrame Object
        JFrame jFrame= new JFrame();
        // To check Visibility
        jFrame.setVisible(true);
        // control Execution
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        set window size
//        jFrame.setSize(300,300);
        // set window location
//        jFrame.setLocation(100, 100);
        // set window  location and size by one method
        jFrame.setBounds(100, 100, 400, 400);
        // to set Frame Title
        jFrame.setTitle("JFrame Demo");

        // size fixed by setResize method
        jFrame.setResizable(false);
    }

}
