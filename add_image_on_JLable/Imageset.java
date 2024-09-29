package add_image_on_JLable;

import javax.swing.*;
import java.awt.*;

public class Imageset extends JFrame {
    private Container C;
    private JLabel Image;
    private ImageIcon img;

    Imageset(){
        initComponent();
    }
     public void initComponent(){
        C= this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.pink);

        img= new ImageIcon(getClass().getResource("/add_image_on_JLable/Imageset.jpg "));

        Image = new JLabel(img);

        Image.setBounds(50,30,150,200);
        C.add(Image);
     }

    public static void main(String[] args) {
        Imageset frame=new Imageset();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Image set");
        frame.setResizable(false);
    }

}
