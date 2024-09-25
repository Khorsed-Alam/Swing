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
