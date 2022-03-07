package grafiquitos;

import com.sun.tools.javac.Main;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.awt.*;

public class clasepruebagui extends JFrame {

    private JPanel Panel1;


    public clasepruebagui() {

    }

    private void createUIComponents() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("clasepruebagui");
        frame.setContentPane(new clasepruebagui().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
