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

    int count = 0;

    private Carta C1;
    private JButton B1;
    private Carta C2;
    private JButton B2;

    public cartasGUI() throws IOException {

        //JToggleButton boton1= new JToggleButton();


        BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\cora.png")); //C:\Users\DAM\Desktop - C:\Users\walls\OneDrive\Escritorio
        Image carta1 = bufferedImage1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        //ImageIcon icon1 = new ImageIcon(carta1);

        Carta corason = new Carta(new ImageIcon(carta1));
        corason.setNum(2);
        corason.setRev(true);

        BufferedImage bufferedrev = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\rev.jpg"));
        Image cartarev = bufferedrev.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon iconrev = new ImageIcon(cartarev);

        Boton1.setIcon(iconrev);

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (corason.isRev()){
                    Boton1.setIcon(corason.getFotocarta());
                }else{
                    Boton1.setIcon(iconrev);
                }
                corason.setRev(!corason.isRev());

                count++;


                if (count == 1){
                    C1 = corason;
                    B1 = Boton1;
                }
                if (count == 2){
                    count=0;
                    C2 = corason;
                    B2 = Boton1;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);

                    }
                    count = 0;
                }
            }
        });

        BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\romb.jpg"));
        Image carta2 = bufferedImage2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta rombo = new Carta(new ImageIcon(carta2));
        rombo.setNum(6);
        rombo.setRev(true);

        Boton2.setIcon(iconrev);

        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rombo.isRev()){
                    Boton2.setIcon(rombo.getFotocarta());
                }else{
                    Boton2.setIcon(iconrev);
                }
                rombo.setRev(!rombo.isRev());

                count++;


                if (count == 1){
                    C1 = rombo;
                    B1 = Boton2;
                    System.out.println(C1);
                }
                if (count == 2){
                    C2 = rombo;
                    B2 = Boton2;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\pica.png"));
        Image carta3 = bufferedImage3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta pica = new Carta(new ImageIcon(carta3));
        pica.setNum(1);
        pica.setRev(true);

        Boton3.setIcon(iconrev);

        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (pica.isRev()){
                    Boton3.setIcon(pica.getFotocarta());
                }else{
                    Boton3.setIcon(iconrev);
                }
                pica.setRev(!pica.isRev());

                count++;

                if (count == 1){
                    C1 = pica;
                    B1 = Boton3;
                }
                if (count == 2){
                    count=0;
                    C2 = pica;
                    B2 = Boton3;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        BufferedImage bufferedImage4 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\treboles.jpg"));
        Image carta4 = bufferedImage4.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta treboles = new Carta(new ImageIcon(carta4));
        treboles.setNum(4);
        treboles.setRev(true);

        Boton4.setIcon(iconrev);

        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (treboles.isRev()){
                    Boton4.setIcon(treboles.getFotocarta());
                }else{
                    Boton4.setIcon(iconrev);
                }
                treboles.setRev(!treboles.isRev());

                count++;

                if (count == 1){
                    C1 = treboles;
                    B1 = Boton4;
                }
                if (count == 2){
                    count=0;
                    C2 = treboles;
                    B2 = Boton4;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        Carta treboles2 = new Carta(new ImageIcon(carta4));
        treboles2.setNum(4);
        treboles2.setRev(true);

        Boton5.setIcon(iconrev);

        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (treboles2.isRev()){
                    Boton5.setIcon(treboles2.getFotocarta());
                }else{
                    Boton5.setIcon(iconrev);
                }
                treboles2.setRev(!treboles2.isRev());

                count++;

                if (count == 1){
                    C1 = treboles2;
                    B1 = Boton5;
                }
                if (count == 2){
                    count=0;
                    C2 = treboles2;
                    B2 = Boton5;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        BufferedImage bufferedImage5 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\pika.jpg"));
        Image carta5 = bufferedImage5.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta kachu = new Carta(new ImageIcon(carta5));
        kachu.setNum(10);
        kachu.setRev(true);

        Boton6.setIcon(iconrev);

        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (kachu.isRev()){
                    Boton6.setIcon(kachu.getFotocarta());
                }else{
                    Boton6.setIcon(iconrev);
                }
                kachu.setRev(!kachu.isRev());

                count++;

                if (count == 1){
                    C1 = kachu;
                    B1 = Boton6;
                }
                if (count == 2){
                    count=0;
                    C2 = kachu;
                    B2 = Boton6;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });


        Carta corason2 = new Carta(new ImageIcon(carta1));
        corason2.setNum(2);
        corason2.setRev(true);
        Boton7.setIcon(iconrev);

        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (corason2.isRev()){
                    Boton7.setIcon(corason2.getFotocarta());
                }else{
                    Boton7.setIcon(iconrev);
                }
                corason2.setRev(!corason2.isRev());

                count++;

                if (count == 1){
                    C1 = corason2;
                    B1 = Boton7;
                }
                if (count == 2){
                    count=0;
                    C2 = corason2;
                    B2 = Boton7;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        BufferedImage bufferedImage6 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\mario.jpg"));
        Image carta6 = bufferedImage6.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        Carta itsamee = new Carta(new ImageIcon(carta6));
        itsamee.setNum(11);
        itsamee.setRev(true);

        Boton8.setIcon(iconrev);

        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (itsamee.isRev()){
                    Boton8.setIcon(itsamee.getFotocarta());
                }else{
                    Boton8.setIcon(iconrev);
                }
                itsamee.setRev(!itsamee.isRev());

                count++;

                if (count == 1){
                    C1 = itsamee;
                    B1 = Boton8;
                }
                if (count == 2){
                    count=0;
                    C2 = itsamee;
                    B2 = Boton8;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        Carta rombo2 = new Carta(new ImageIcon(carta2));
        rombo2.setNum(6);
        rombo2.setRev(true);

        Boton9.setIcon(iconrev);

        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rombo2.isRev()){
                    Boton9.setIcon(rombo2.getFotocarta());
                }else{
                    Boton9.setIcon(iconrev);
                }
                rombo2.setRev(!rombo2.isRev());

                count++;

                if (count == 1){
                    C1 = rombo2;
                    B1 = Boton9;
                }
                if (count == 2){
                    count=0;
                    C2 = rombo2;
                    B2 = Boton9;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        Carta itsamee2 = new Carta(new ImageIcon(carta6));
        itsamee2.setNum(11);
        itsamee2.setRev(true);

        Boton10.setIcon(iconrev);

        Boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (itsamee2.isRev()){
                    Boton10.setIcon(itsamee2.getFotocarta());
                }else{
                    Boton10.setIcon(iconrev);
                }
                itsamee2.setRev(!itsamee2.isRev());

                count++;

                if (count == 1){
                    C1 = itsamee2;
                    B1 = Boton10;
                }
                if (count == 2){
                    count=0;
                    C2 = itsamee2;
                    B2 = Boton10;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        Carta pica2 = new Carta(new ImageIcon(carta3));
        pica2.setNum(1);
        pica2.setRev(true);

        Boton11.setIcon(iconrev);

        Boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (pica2.isRev()){
                    Boton11.setIcon(pica2.getFotocarta());
                }else{
                    Boton11.setIcon(iconrev);
                }
                pica2.setRev(!pica2.isRev());

                count++;

                if (count == 1){
                    C1 = pica2;
                    B1 = Boton11;
                }
                if (count == 2){
                    count=0;
                    C2 = pica2;
                    B2 = Boton11;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });

        Carta kachu2 = new Carta(new ImageIcon(carta5));
        kachu2.setNum(10);
        kachu2.setRev(true);

        Boton12.setIcon(iconrev);

        Boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (kachu2.isRev()){
                    Boton12.setIcon(kachu2.getFotocarta());
                }else{
                    Boton12.setIcon(iconrev);
                }
                kachu2.setRev(!kachu2.isRev());

                count++;

                if (count == 1){
                    C1 = kachu2;
                    B1 = Boton12;
                }
                if (count == 2){
                    count=0;
                    C2 = kachu2;
                    B2 = Boton12;

                    if (C1.getNum()!=C2.getNum()){

                        B1.setIcon(iconrev);
                        C1.setRev(true);
                        B2.setIcon(iconrev);
                        C2.setRev(true);
                    }
                    count = 0;
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Juego de memoria 1.0");
        frame.setContentPane(new cartasGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
