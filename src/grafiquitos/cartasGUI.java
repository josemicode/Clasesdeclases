package grafiquitos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class cartasGUI extends JFrame{
    private JPanel mainPanel;
    private JButton Boton1;
    private JButton Boton2;
    private JButton Boton3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;

    boolean rev1 = false;
    boolean rev2 = false;
    boolean rev3 = false;
    boolean rev4 = false;
    boolean rev5 = false;
    boolean rev6 = false;
    boolean rev7 = false;
    boolean rev8 = false;

    public cartasGUI() throws IOException {

        //JToggleButton boton1= new JToggleButton();

        BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\walls\\OneDrive\\Escritorio\\cora.png"));
        Image carta1 = bufferedImage1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(carta1);

        BufferedImage bufferedrev = ImageIO.read(new File("C:\\Users\\walls\\OneDrive\\Escritorio\\rev.jpg"));
        Image cartarev = bufferedrev.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon iconrev = new ImageIcon(cartarev);

        Boton1.setIcon(icon1);

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev1){
                    Boton1.setIcon(icon1);
                }else{
                    Boton1.setIcon(iconrev);
                }
                rev1 = !rev1;

            }
        });

        BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\walls\\OneDrive\\Escritorio\\romb.png"));
        Image carta2 = bufferedImage2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(carta2);

        Boton2.setIcon(icon2);

        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev2){
                    Boton2.setIcon(icon2);
                }else{
                    Boton2.setIcon(iconrev);
                }
                rev2 = !rev2;

            }
        });

        BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\walls\\OneDrive\\Escritorio\\romb.png"));
        Image carta3 = bufferedImage3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(carta3);

        Boton3.setIcon(icon3);

        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev3){
                    Boton3.setIcon(icon3);
                }else{
                    Boton3.setIcon(iconrev);
                }
                rev3 = !rev3;

            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("cartasGUI");
        frame.setContentPane(new cartasGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
