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
        ImageIcon img= new ImageIcon("Error.png");
        JOptionPane.showMessageDialog(null , "Wrong Password","Warning",JOptionPane.ERROR_MESSAGE,img);

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