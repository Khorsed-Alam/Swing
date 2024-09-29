<h1>Swing</h1>
     <h2>Swing Topic </h2>
<ol>
<li>J component</li>
<li>Listener</li>
<li>LayoutManger</li>
<li>Swing Apps</li>
<li>Database</li>
</ol>

<h2>J Component </h2>
<ul>
<li>JOptionPane</li>
<li>JFrame</li>
<li>JTextField</li>
<li>JLable</li>
<li>JTextField</li>
<li>JPasswordField</li>
<li>JScrollPane</li>
<li>JTextArea</li>
<li>JRadioButton</li>
<li>JCheckBox</li>
<li>JComboBox</li>
<li>JPanel</li>
<li>JToggleButton</li>
<lI>JSlider</lI>
<li>JSpinner</li>
<li>JColorChooser</li>
<li>JFileChooser</li>
<li>JTabbedPane</li>
<li>JTable</li>
<li>JProgressBar</li>
<li>JTree</li>
<li>JMenu</li>
<li>JMenuItem</li>
<li>JPopupMenu</li>
<li>JSeparator</li>
<li>JDialog</li>
<li>JLayeredPane</li>
</ul>


<h2>Listener</h2>
<ul>
<li>ActionListener</li>
<li>ItemListener</li>
<li>KeyListener</li>
<li>MouseListener</li>
<li>MouseMotionListener</li>
<li>FocusListener</li>
<li>WindowListener</li>
<li>ChangeListener</li>
<li>WindowListener</li>
<li>ChangeListener</li>
<li>ListSelectionListener </li>
</ul>


<h2>LayoutManagers</h2>
<ul>
<li>Null</li>
<li>BorderLayout</li>
<li>FlowLayout</li>
<li>BoxLayout</li>
<li>GridLayout</li>
<li>CardLayout</li>
<li>GridBagLayout</li>
</ul>

<h2>SwingApps</h2>
<ul>
<li>Login Frame</li>
<li>Calculator</li>
<li>Multiplication Table</li>
<li>Vowel Counter</li>
<li>SlideShow</li>
<li>Student Management</li>
<li>NotePad</li>
<li>Guessing Game</li>
</ul>

<H2>Java Program Run From Command Line</h2>
<p>Procedure </p>
<ol>
<li>javac---->Path Setup</li>
<li>cls ---->Screen Clear</li>
<li>cd Desktop ---> Change Directory </li>
<li>javac File.java--->Compile</li>
<li>java File----> Run</li>
</ol>


<h2>showMessageDialog</h2>
<p>A dialog window is an important sub window meant to carry temporary notice apart from the main swing application windows</p>\

<h3>Some important method related to JOptionPane class</h3>
<ul>
<li>{showMessageDialog()} ---> to show dialog </li>
<li>{showInputDialog()} ---->to get input from user </li>
<li>{showOptionDialog()} ---->User input as an option </li>
<li>{showConfirmDialog()} --->To take conformation from user</li>
</ul>

<h3>ShowMessageDialog()</h3>
<p>Syntax</p>
<ol>
<li>JOptionPane.showMessageDialog(2 parameters);</li>
<li>JOptionPane.showMessageDialog(4 Parameter);</li>
<li>JOptionPane.showMessageDialog(5 Parameter);</li>
</ol>

````java
package showMessageDialog;

import javax.swing.*;

public class showMessageDialog_2Parameter {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null , "Wrong Password");
        //JOptionPane.showMessageDialog(Window Location null means "Center " , Message "Wrong Password");
    }
}


````

<h3>showMessageDialog_4Parameter</h3>
<p><strong>Syntax:</strong>JOptionPane.showMessageDialog( Window Location== null(center) , Message== "Wrong Password",Title == "Warning",Icon Show == JOptionPane.ERROR_MESSAGE);</p>

 <h4>JOptionPaneIcons</h4>

|Icon| Code                            |IDE value|
|----|---------------------------------|-----|
|NoIcon| JOptionPane.PLAIN_MESSAGE       |-1|
|Error Icon| JOptionPane.ERROR_MESSAGE       |0|
|Informatin Icon| JOptionPane.INFORMATION_MESSAGE |1|
|Warning Icon| JOptionPane.WARNING_MESSAGE     |2|
|Question Icon| JOptionPane.QUESTION_MESSAGE    |3|


```java
package showMessageDialog_4Parameter;

import javax.swing.*;

public class showMessageDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null ,"Wrong Password","Warning",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog( Window Location== null(center) , Message== "Wrong Password",Title == "Warning",Icon Show == JOptionPane.ERROR_MESSAGE);

    }

}



```

<h3>showMessageDialog_5Parameter</h3>
<h6>Add customize icon</h6>
<em>First of all we need to create an object of ImageIcon class<em><br/>
<p> <strong>Syntax:</strong> JOptionPane.showMessageDialog(Window Loacation , "Message that we will show into window" , "Title of window"  , "Window Icon" , "customize Icon or image"</p>

````java
package showMessageDialog_5Parameter;

import javax.swing.*;

public class showMessageDialog {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("showMessageDialog_5Parameter/Error.png");
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE, img);

    }
}

````

<h2>showInputDialog</h2>
<b>{showInputDialog()} ---->to get input from user</b>


```java
package showInputDialog;

import javax.swing.*;

public class showInputDialog_1Attribute {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("Enter you name: ");
        JOptionPane.showMessageDialog(null , "Welcome "+name);

    }
}

```

`````java
package showInputDialog;

import javax.swing.*;

public class showInputDialog_2Attribute {
    public static void main(String[] args) {
        String F_name= JOptionPane.showInputDialog("Enter your name: ", "Name");
        JOptionPane.showMessageDialog(null , "Hello "+F_name);

    }
}

`````

```java
package showInputDialog;

import javax.swing.*;

public class showInputDialog_4Attribute {
    public static void main(String[] args) {
        String F_name= JOptionPane.showInputDialog(null, "enter your name: ", "Title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null , "Your name "+F_name, "Output",JOptionPane.QUESTION_MESSAGE);
    }
}


```

````java
package showInputDialog;

import javax.swing.*;

public class TwoStepshowInputDialog {
    public static void main(String[] args) {
        String F_Name= JOptionPane.showInputDialog(null , "Enter your name: ", "Input Page 1",JOptionPane.INFORMATION_MESSAGE);
        String L_Name= JOptionPane.showInputDialog( null , "Enter your Name: ", "Input page 2",JOptionPane.INFORMATION_MESSAGE);
        String name= F_Name+ L_Name;
        JOptionPane.showMessageDialog(null,"Your Full Name: "+name);
    }
}

````

<h2>showConfirmDialog</h2>
<em>To take conformation from user</em>

````java
package showConfirmDialog;

import javax.swing.*;

public class showConfirmDialog {
    public static void main(String[] args) {
        int choice= JOptionPane.showConfirmDialog(null,"Do you want to quit this Program ","Title",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else if(choice== JOptionPane.NO_OPTION){
            System.exit(0);
        }else {
            System.out.println("You have clicked cancle Option");
        }
    }
}

````
<h1>JFrame</h1>
<h3>What is JFrame</h3>
<p>Frame is a class in Java and has its own methods and constructors. Methods are functions that impact the JFrame, such as setting the size or visibility</p>


<h4>JFrame Method</h4>
<ul>
<li>setVisible()----> Check Visibility </li>
<li>setDefaultCloseOperation()----> To stop execution </li>
<li>setSize()---->to set custom size</li>
<li>setLocation()---->To set custom Location </li>
<li>setLocationRelativeTo()----> To set Location directly center</li>
<li>setBounds()----> Combination of location and size</li>
<li>setTitle()----> To set custom Title</li>
<li>setResizable()----> Windows size control </li>
</ul>

````java
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

````


<h4>Inherit JFrame</h4>

```java
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


```

<h4>Use Constructor</h4>

````java
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

````


<h2>Change JFrame Icon </h2>
<em>Element</em>
<ul>
<li>Need an icon</li>
<li>Make an object of ImageIcon class </li>
<li>getClass() </li>
<li>getResource() </li>
<li>setIconImage()</li>
<li>getImage() </li>
</ul>

````java
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

````

<h2>Change JFrame Background Color</h2>
<em>Element</em>
<ul>
<li>setBackground() </li>
</ul>

```java
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

```
<h2>JLabel</h2>
<p>Element for JLabel</p>
<ul>
<li>setText()</li>
<li>setBounds() </li>
</ul>


<em>Create Single JLabel</em>

````java
package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class CreateJLabel extends JFrame {
    private Container c;
    private JLabel userLable;

    CreateJLabel() {
        initComponents();
    }
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);

        userLable = new JLabel();
        userLable.setText("Enter Your User name");
        userLable.setBounds(40,040, 100,200);
        c.add(userLable);

    }
    public static void main(String[] args) {
        CreateJLabel frame= new CreateJLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 500,500);
        frame.setTitle("CreateJLabel");
        frame.setResizable(false);
    }
    
    }

````

<em>Create Multiple JLabel</em>
```java
package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class CreateMultipleJLabel extends JFrame {
    private Container c;
    private JLabel UserLabel;
    private JLabel UserPass;

    CreateMultipleJLabel(){
        initContainer();
    }
    public void initContainer(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

        JLabel UserLabel = new JLabel();
        UserLabel.setText("Enter Your UserName: ");
        UserLabel.setBounds(50,20,150,50);
        c.add(UserLabel);

        JLabel UserPass= new JLabel("Enter your Password: ");
        UserPass.setBounds(50,40,150,50);
        c.add(UserPass);



    }
    public static void main(String[] args) {

        CreateMultipleJLabel frame= new CreateMultipleJLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 500,500);
        frame.setTitle("CreateJLabel");
        frame.setResizable(false);
    }
}

```

<h2>Font Style and size of JLabel</h2>

<b>Create new Object ("Font Name", Font style,Font Size );
<p> Font font = new Font("Arial",Font.BOLD,14);</p>

````java
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

````

<h2>How to set Foreground and  Background color of JLabel</h2>
<em>Element <em>
<ul>
<li>setOpaque()</li>
<li>setBackground()---> to change text Background</li>
<li>setForeground()--->To change text color </li>
</ul>


````java
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

````


<h2>How to Add Tips to JLable </h2>
<ol>
<li>setText()</li>
<li>getTest()</li>
<li>setToolTipText()</li>
<li>getTolTipText() </li>
</ol>


````java
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

````

<h2>How To add image on JLable</h2>
<ul>
<li>ImageIcon</li>
<li>getClass()</li>
<li>getResource()</li>
</ul>

````java
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

        Image.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
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

````