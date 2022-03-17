package grafiquitos;

import cosasdeclases.blackjack.Carta;

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
    private JButton Boton5;
    private JButton Boton9;
    private JButton Boton6;
    private JButton Boton10;
    private JButton Boton7;
    private JButton Boton11;
    private JButton Boton4;
    private JButton Boton8;
    private JButton Boton12;
    private JLabel counter;

    boolean rev1 = true;
    boolean rev2 = true;
    boolean rev3 = true;
    boolean rev4 = true;
    boolean rev5 = true;
    boolean rev6 = true;
    boolean rev7 = true;
    boolean rev8 = true;
    boolean rev9 = true;
    boolean rev10 = true;
    boolean rev11 = true;
    boolean rev12 = true;

    int count = 0;

    private int C1;
    private JButton B1;
    private int C2;
    private JButton B2;

    public cartasGUI() throws IOException {

        //JToggleButton boton1= new JToggleButton();


        BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\cora.png")); //C:\Users\DAM\Desktop - C:\Users\walls\OneDrive\Escritorio
        Image carta1 = bufferedImage1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        //ImageIcon icon1 = new ImageIcon(carta1);

        Carta corason = new Carta(new ImageIcon(carta1));
        corason.setNum(2);

        BufferedImage bufferedrev = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\rev.jpg"));
        Image cartarev = bufferedrev.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon iconrev = new ImageIcon(cartarev);

        Boton1.setIcon(iconrev);

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev1){
                    Boton1.setIcon(corason.getFotocarta());
                }else{
                    Boton1.setIcon(iconrev);
                }
                rev1 = !rev1;

                count++;

                if (count == 1){
                    C1 = corason.getNum();
                    B1 = Boton1;
                }
                if (count == 2){
                    C2 = corason.getNum();
                    B2 = Boton2;

                    if (C1!=C2){

                    }
                }
            }
        });

        BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\romb.jpg"));
        Image carta2 = bufferedImage2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta rombo = new Carta(new ImageIcon(carta2));

        Boton2.setIcon(iconrev);

        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev2){
                    Boton2.setIcon(rombo.getFotocarta());
                }else{
                    Boton2.setIcon(iconrev);
                }
                rev2 = !rev2;

                count++;
            }
        });

        BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\pica.png"));
        Image carta3 = bufferedImage3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta pica = new Carta(new ImageIcon(carta3));

        Boton3.setIcon(iconrev);

        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev3){
                    Boton3.setIcon(pica.getFotocarta());
                }else{
                    Boton3.setIcon(iconrev);
                }
                rev3 = !rev3;

                count++;
            }
        });

        BufferedImage bufferedImage4 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\treboles.jpg"));
        Image carta4 = bufferedImage4.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta treboles = new Carta(new ImageIcon(carta4));

        Boton4.setIcon(iconrev);

        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev4){
                    Boton4.setIcon(treboles.getFotocarta());
                }else{
                    Boton4.setIcon(iconrev);
                }
                rev4 = !rev4;

                count++;
            }
        });

        Boton5.setIcon(iconrev);

        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev5){
                    Boton5.setIcon(treboles.getFotocarta());
                }else{
                    Boton5.setIcon(iconrev);
                }
                rev5 = !rev5;

                count++;
            }
        });

        BufferedImage bufferedImage5 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\pika.jpg"));
        Image carta5 = bufferedImage5.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta kachu = new Carta(new ImageIcon(carta5));

        Boton6.setIcon(iconrev);

        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev6){
                    Boton6.setIcon(kachu.getFotocarta());
                }else{
                    Boton6.setIcon(iconrev);
                }
                rev6 = !rev6;

                count++;
            }
        });

        Boton7.setIcon(iconrev);

        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev7){
                    Boton7.setIcon(corason.getFotocarta());
                }else{
                    Boton7.setIcon(iconrev);
                }
                rev7 = !rev7;

                count++;

                //if () {

                //}
            }
        });

        BufferedImage bufferedImage6 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\mario.jpg"));
        Image carta6 = bufferedImage6.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta itsamee = new Carta(new ImageIcon(carta6));

        Boton8.setIcon(iconrev);

        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev8){
                    Boton8.setIcon(itsamee.getFotocarta());
                }else{
                    Boton8.setIcon(iconrev);
                }
                rev8 = !rev8;

                count++;
            }
        });

        Boton9.setIcon(iconrev);

        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev9){
                    Boton9.setIcon(rombo.getFotocarta());
                }else{
                    Boton9.setIcon(iconrev);
                }
                rev9 = !rev9;

                count++;
            }
        });

        Boton10.setIcon(iconrev);

        Boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev10){
                    Boton10.setIcon(itsamee.getFotocarta());
                }else{
                    Boton10.setIcon(iconrev);
                }
                rev10 = !rev10;

                count++;
            }
        });

        Boton11.setIcon(iconrev);

        Boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev11){
                    Boton11.setIcon(pica.getFotocarta());
                }else{
                    Boton11.setIcon(iconrev);
                }
                rev11 = !rev11;

                count++;
            }
        });

        Boton12.setIcon(iconrev);

        Boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rev12){
                    Boton12.setIcon(kachu.getFotocarta());
                }else{
                    Boton12.setIcon(iconrev);
                }
                rev12 = !rev12;

                count++;

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
