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

|Icon| Code                     |IDE value|
|----|--------------------------|-----|
|NoIcon| JOptionPanePLAIN_MESSAGE |-1|
|Error Icon|JOptionPaneERROR_MESSAGE|0|
|Informatin Icon| JOptionPaneINFORMATION_MESSAGE|1|
|Warning Icon|JOptionPaneWARNING_MESSAGE|2|
|Question Icon|JOptionPaneQUESTION_MESSAGE|3|


```java
package showMessageDialog;

import javax.swing.*;

public class showMessageDialog_4Parameter {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null ,"Wrong Password","Warning",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog( Window Location== null(center) , Message== "Wrong Password",Title == "Warning",Icon Show == JOptionPane.ERROR_MESSAGE);
         
    }
}

```


