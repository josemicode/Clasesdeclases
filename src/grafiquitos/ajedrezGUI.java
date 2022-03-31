package grafiquitos;

import herencias.clases.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ajedrezGUI {
    private JButton A1;
    private JButton A2;
    private JButton B1;
    private JButton D2;
    private JButton C1;
    private JButton D1;
    private JButton C3;
    private JButton C2;
    private JButton B2;
    private JButton C4;
    private JButton A3;
    private JButton A4;
    private JButton B3;
    private JButton B4;
    private JButton D3;
    private JButton E3;
    private JButton D4;
    private JButton E4;
    private JButton D5;
    private JButton E5;
    private JButton C5;
    private JButton E2;
    private JButton D6;
    private JButton E6;
    private JButton A5;
    private JButton A6;
    private JButton A7;
    private JButton A8;
    private JButton C6;
    private JButton C7;
    private JButton C8;
    private JButton F2;
    private JButton D8;
    private JButton D7;
    private JButton E8;
    private JButton E7;
    private JButton B5;
    private JButton F3;
    private JButton F4;
    private JButton F5;
    private JButton F6;
    private JButton F7;
    private JButton F8;
    private JButton G8;
    private JButton G7;
    private JButton G6;
    private JButton G5;
    private JButton G4;
    private JButton G3;
    private JButton B6;
    private JButton H8;
    private JButton H7;
    private JButton H6;
    private JButton H5;
    private JButton H4;
    private JButton H3;
    private JButton B7;
    private JButton H1;
    private JButton G2;
    private JButton H2;
    private JButton G1;
    private JButton F1;
    private JButton E1;
    private JButton B8;
    private JPanel mainPanel;

    private int count = 0;

    private Casilla Cas1;// = new Casilla(0,'A');
    //private Casilla Cas2;
    private JButton Boton1;
    //private JButton Boton2;

    public ajedrezGUI() throws IOException {

        Tablero tablet = new Tablero();

        Caballo cab1 = new Caballo("n");
        BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\caballonegro.png"));
        Image imgcabnegro = bufferedImage1.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        cab1.setImg(new ImageIcon(imgcabnegro));
        tablet.getCasillas().get(57).setFigura(cab1);
        cab1.setCas(tablet.getCasillas().get(57));

        B8.setIcon(tablet.getCasillas().get(57).getFigura().getImg());

        Caballo cab2 = new Caballo("b");
        BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\caballoblanco.png"));
        Image imgcabblanco = bufferedImage2.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        cab2.setImg(new ImageIcon(imgcabblanco));
        tablet.getCasillas().get(1).setFigura(cab2);
        cab2.setCas(tablet.getCasillas().get(1));

        B1.setIcon(tablet.getCasillas().get(1).getFigura().getImg());

        Caballo cab3 = new Caballo("n");
        cab3.setImg(new ImageIcon(imgcabnegro));
        tablet.getCasillas().get(62).setFigura(cab3);
        cab3.setCas(tablet.getCasillas().get(62));

        G8.setIcon(tablet.getCasillas().get(62).getFigura().getImg());

        Caballo cab4 = new Caballo("b");
        cab1.setImg(new ImageIcon(imgcabblanco));
        tablet.getCasillas().get(6).setFigura(cab1);
        cab1.setCas(tablet.getCasillas().get(6));

        G1.setIcon(tablet.getCasillas().get(6).getFigura().getImg());

        Alfil alf1 = new Alfil("n");
        BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\alfilnegro.png"));
        Image imgalfnegro = bufferedImage3.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        alf1.setImg(new ImageIcon(imgalfnegro));
        tablet.getCasillas().get(58).setFigura(alf1);
        alf1.setCas(tablet.getCasillas().get(58));

        C8.setIcon(tablet.getCasillas().get(58).getFigura().getImg());

        Alfil alf2 = new Alfil("b");
        BufferedImage bufferedImage4 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\alfilblanco.png"));
        Image imgalfblanco = bufferedImage4.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        alf2.setImg(new ImageIcon(imgalfblanco));
        tablet.getCasillas().get(2).setFigura(alf2);
        alf2.setCas(tablet.getCasillas().get(2));

        C1.setIcon(tablet.getCasillas().get(2).getFigura().getImg());

        Alfil alf3 = new Alfil("n");
        alf3.setImg(new ImageIcon(imgalfnegro));
        tablet.getCasillas().get(61).setFigura(alf3);
        alf3.setCas(tablet.getCasillas().get(61));

        F8.setIcon(tablet.getCasillas().get(61).getFigura().getImg());

        Alfil alf4 = new Alfil("b");
        alf4.setImg(new ImageIcon(imgalfblanco));
        tablet.getCasillas().get(5).setFigura(alf4);
        alf4.setCas(tablet.getCasillas().get(5));

        F1.setIcon(tablet.getCasillas().get(5).getFigura().getImg());

        Reina rna1 = new Reina("n");
        BufferedImage bufferedImage5 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reinanegra.png"));
        Image imgrnanegro = bufferedImage5.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        rna1.setImg(new ImageIcon(imgrnanegro));
        tablet.getCasillas().get(59).setFigura(rna1);
        rna1.setCas(tablet.getCasillas().get(59));

        D8.setIcon(tablet.getCasillas().get(59).getFigura().getImg());

        Reina rna2 = new Reina("b");
        BufferedImage bufferedImage6 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reinablanca.png"));
        Image imgrnablanco = bufferedImage6.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        rna2.setImg(new ImageIcon(imgrnablanco));
        tablet.getCasillas().get(3).setFigura(rna2);
        rna2.setCas(tablet.getCasillas().get(3));

        D1.setIcon(tablet.getCasillas().get(3).getFigura().getImg());

        Rey kng1 = new Rey("n");
        BufferedImage bufferedImage7 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reynegro.png"));
        Image imgkngnegro = bufferedImage7.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        kng1.setImg(new ImageIcon(imgkngnegro));
        tablet.getCasillas().get(60).setFigura(kng1);
        kng1.setCas(tablet.getCasillas().get(60));

        E8.setIcon(tablet.getCasillas().get(60).getFigura().getImg());

        Rey kng2 = new Rey("b");
        BufferedImage bufferedImage8 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reyblanco.png"));
        Image imgkngblanco = bufferedImage8.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        kng2.setImg(new ImageIcon(imgkngblanco));
        tablet.getCasillas().get(4).setFigura(kng2);
        kng2.setCas(tablet.getCasillas().get(4));

        E1.setIcon(tablet.getCasillas().get(4).getFigura().getImg());

        Torre trr1 = new Torre("n");
        BufferedImage bufferedImage9 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\torrenegra.png"));
        Image imgtrrnegro = bufferedImage9.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        trr1.setImg(new ImageIcon(imgtrrnegro));
        tablet.getCasillas().get(56).setFigura(trr1);
        trr1.setCas(tablet.getCasillas().get(56));

        A8.setIcon(tablet.getCasillas().get(56).getFigura().getImg());

        Torre trr2 = new Torre("b");
        BufferedImage bufferedImage10 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\torreblanca.png"));
        Image torreblanca = bufferedImage10.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        trr2.setImg(new ImageIcon(torreblanca));
        tablet.getCasillas().get(0).setFigura(trr2);
        trr2.setCas(tablet.getCasillas().get(0));

        A1.setIcon(tablet.getCasillas().get(0).getFigura().getImg());

        Torre trr3 = new Torre("n");
        trr3.setImg(new ImageIcon(imgtrrnegro));
        tablet.getCasillas().get(63).setFigura(trr3);
        trr3.setCas(tablet.getCasillas().get(63));

        H8.setIcon(tablet.getCasillas().get(63).getFigura().getImg());

        Torre trr4 = new Torre("b");
        trr4.setImg(new ImageIcon(torreblanca));
        tablet.getCasillas().get(7).setFigura(trr4);
        trr4.setCas(tablet.getCasillas().get(7));

        H1.setIcon(tablet.getCasillas().get(7).getFigura().getImg());

        Peon pe1 = new Peon("n");
        BufferedImage bufferedImage11 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\peonnegro.png"));
        Image peonnegro = bufferedImage11.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        pe1.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(48).setFigura(pe1);
        pe1.setCas(tablet.getCasillas().get(48));

        A7.setIcon(tablet.getCasillas().get(48).getFigura().getImg());

        Peon pe2 = new Peon("n");
        pe2.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(49).setFigura(pe2);
        pe2.setCas(tablet.getCasillas().get(49));

        B7.setIcon(tablet.getCasillas().get(49).getFigura().getImg());

        Peon pe3 = new Peon("n");
        pe3.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(50).setFigura(pe3);
        pe3.setCas(tablet.getCasillas().get(50));

        C7.setIcon(tablet.getCasillas().get(50).getFigura().getImg());

        Peon pe4 = new Peon("n");
        pe4.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(51).setFigura(pe4);
        pe4.setCas(tablet.getCasillas().get(51));

        D7.setIcon(tablet.getCasillas().get(51).getFigura().getImg());

        Peon pe5 = new Peon("n");
        pe5.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(52).setFigura(pe5);
        pe5.setCas(tablet.getCasillas().get(52));

        E7.setIcon(tablet.getCasillas().get(52).getFigura().getImg());

        Peon pe6 = new Peon("n");
        pe6.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(53).setFigura(pe6);
        pe6.setCas(tablet.getCasillas().get(53));

        F7.setIcon(tablet.getCasillas().get(53).getFigura().getImg());

        Peon pe7 = new Peon("n");
        pe7.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(54).setFigura(pe7);
        pe7.setCas(tablet.getCasillas().get(54));

        G7.setIcon(tablet.getCasillas().get(54).getFigura().getImg());

        Peon pe8 = new Peon("n");
        pe8.setImg(new ImageIcon(peonnegro));
        tablet.getCasillas().get(55).setFigura(pe8);
        pe8.setCas(tablet.getCasillas().get(55));

        H7.setIcon(tablet.getCasillas().get(55).getFigura().getImg());

        Peon pe9 = new Peon("b");
        BufferedImage bufferedImage12 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\peonblanco.png"));
        Image peonblanco = bufferedImage12.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        pe9.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(8).setFigura(pe9);
        pe9.setCas(tablet.getCasillas().get(8));

        A2.setIcon(tablet.getCasillas().get(8).getFigura().getImg());

        Peon pe10 = new Peon("b");
        pe10.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(9).setFigura(pe10);
        pe10.setCas(tablet.getCasillas().get(9));

        B2.setIcon(tablet.getCasillas().get(9).getFigura().getImg());

        Peon pe11 = new Peon("b");
        pe11.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(10).setFigura(pe11);
        pe11.setCas(tablet.getCasillas().get(10));

        C2.setIcon(tablet.getCasillas().get(10).getFigura().getImg());

        Peon pe12 = new Peon("b");
        pe12.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(11).setFigura(pe12);
        pe12.setCas(tablet.getCasillas().get(11));

        D2.setIcon(tablet.getCasillas().get(11).getFigura().getImg());

        Peon pe13 = new Peon("b");
        pe13.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(12).setFigura(pe13);
        pe13.setCas(tablet.getCasillas().get(12));

        E2.setIcon(tablet.getCasillas().get(12).getFigura().getImg());

        Peon pe14 = new Peon("b");
        pe14.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(13).setFigura(pe14);
        pe14.setCas(tablet.getCasillas().get(13));

        F2.setIcon(tablet.getCasillas().get(13).getFigura().getImg());

        Peon pe15 = new Peon("b");
        pe15.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(14).setFigura(pe15);
        pe15.setCas(tablet.getCasillas().get(14));

        G2.setIcon(tablet.getCasillas().get(14).getFigura().getImg());

        Peon pe16 = new Peon("b");
        pe16.setImg(new ImageIcon(peonblanco));
        tablet.getCasillas().get(15).setFigura(pe16);
        pe16.setCas(tablet.getCasillas().get(15));

        H2.setIcon(tablet.getCasillas().get(15).getFigura().getImg());

        A1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(0);
                    Boton1 = A1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(0));

                    A1.setIcon(tablet.getCasillas().get(0).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }

            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(1);
                    Boton1 = B1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(1));

                    B1.setIcon(tablet.getCasillas().get(1).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(2);
                    Boton1 = C1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(2));

                    C1.setIcon(tablet.getCasillas().get(2).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(3);
                    Boton1 = D1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(3));

                    D1.setIcon(tablet.getCasillas().get(3).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(4);
                    Boton1 = E1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(4));

                    E1.setIcon(tablet.getCasillas().get(4).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(5);
                    Boton1 = F1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(5));

                    F1.setIcon(tablet.getCasillas().get(5).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(6);
                    Boton1 = G1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(6));

                    G1.setIcon(tablet.getCasillas().get(6).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(7);
                    Boton1 = H1;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(7));

                    H1.setIcon(tablet.getCasillas().get(7).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(8);
                    Boton1 = A2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(8));

                    A2.setIcon(tablet.getCasillas().get(8).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(9);
                    Boton1 = B2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(9));

                    B2.setIcon(tablet.getCasillas().get(9).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(10);
                    Boton1 = C2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(10));

                    C2.setIcon(tablet.getCasillas().get(10).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(11);
                    Boton1 = D2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(11));

                    D2.setIcon(tablet.getCasillas().get(11).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(12);
                    Boton1 = E2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(12));

                    E2.setIcon(tablet.getCasillas().get(12).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(13);
                    Boton1 = F2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(13));

                    F2.setIcon(tablet.getCasillas().get(13).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(14);
                    Boton1 = G2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(14));

                    G2.setIcon(tablet.getCasillas().get(14).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(15);
                    Boton1 = H2;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(15));

                    H2.setIcon(tablet.getCasillas().get(15).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(16);
                    Boton1 = A3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(16));

                    A3.setIcon(tablet.getCasillas().get(16).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(17);
                    Boton1 = B3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(17));

                    B3.setIcon(tablet.getCasillas().get(17).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(18);
                    Boton1 = C3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(18));

                    C3.setIcon(tablet.getCasillas().get(18).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(19);
                    Boton1 = D3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(19));

                    D3.setIcon(tablet.getCasillas().get(19).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(20);
                    Boton1 = E3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(20));

                    E3.setIcon(tablet.getCasillas().get(20).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(21);
                    Boton1 = F3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(21));

                    F3.setIcon(tablet.getCasillas().get(21).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(22);
                    Boton1 = G3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(22));

                    G3.setIcon(tablet.getCasillas().get(22).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(23);
                    Boton1 = H3;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(23));

                    H3.setIcon(tablet.getCasillas().get(23).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(24);
                    Boton1 = A4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(24));

                    A4.setIcon(tablet.getCasillas().get(24).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(25);
                    Boton1 = B4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(25));

                    B4.setIcon(tablet.getCasillas().get(25).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(26);
                    Boton1 = C4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(26));

                    C4.setIcon(tablet.getCasillas().get(26).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(27);
                    Boton1 = D4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(27));

                    D4.setIcon(tablet.getCasillas().get(27).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(28);
                    Boton1 = E4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(28));

                    E4.setIcon(tablet.getCasillas().get(28).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(29);
                    Boton1 = F4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(29));

                    F4.setIcon(tablet.getCasillas().get(29).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(30);
                    Boton1 = G4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(30));

                    G4.setIcon(tablet.getCasillas().get(30).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(31);
                    Boton1 = H4;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(31));

                    H4.setIcon(tablet.getCasillas().get(31).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(32);
                    Boton1 = A5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(32));

                    A5.setIcon(tablet.getCasillas().get(32).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(33);
                    Boton1 = B5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(33));

                    B5.setIcon(tablet.getCasillas().get(33).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(34);
                    Boton1 = C5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(34));

                    C5.setIcon(tablet.getCasillas().get(34).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(35);
                    Boton1 = D5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(35));

                    D5.setIcon(tablet.getCasillas().get(35).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(36);
                    Boton1 = E5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(36));

                    E5.setIcon(tablet.getCasillas().get(36).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(37);
                    Boton1 = F5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(37));

                    F5.setIcon(tablet.getCasillas().get(37).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(38);
                    Boton1 = G5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(38));

                    G5.setIcon(tablet.getCasillas().get(38).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(39);
                    Boton1 = H5;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(39));

                    H5.setIcon(tablet.getCasillas().get(39).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(40);
                    Boton1 = A6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(40));

                    A6.setIcon(tablet.getCasillas().get(40).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(41);
                    Boton1 = B6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(41));

                    B6.setIcon(tablet.getCasillas().get(41).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(42);
                    Boton1 = C6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(42));

                    C6.setIcon(tablet.getCasillas().get(42).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(43);
                    Boton1 = D6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(43));

                    D6.setIcon(tablet.getCasillas().get(43).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(44);
                    Boton1 = E6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(44));

                    E6.setIcon(tablet.getCasillas().get(44).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(45);
                    Boton1 = F6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(45));

                    F6.setIcon(tablet.getCasillas().get(45).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(46);
                    Boton1 = G6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(46));

                    G6.setIcon(tablet.getCasillas().get(46).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(47);
                    Boton1 = H6;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(47));

                    H6.setIcon(tablet.getCasillas().get(47).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(48);
                    Boton1 = A7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(48));

                    A7.setIcon(tablet.getCasillas().get(48).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(49);
                    Boton1 = B7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(49));

                    B7.setIcon(tablet.getCasillas().get(49).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(50);
                    Boton1 = C7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(50));

                    C7.setIcon(tablet.getCasillas().get(50).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(51);
                    Boton1 = D7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(51));

                    D7.setIcon(tablet.getCasillas().get(51).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(52);
                    Boton1 = E7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(52));

                    E7.setIcon(tablet.getCasillas().get(52).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(53);
                    Boton1 = F7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(53));

                    F7.setIcon(tablet.getCasillas().get(53).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(54);
                    Boton1 = G7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(54));

                    G7.setIcon(tablet.getCasillas().get(54).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(55);
                    Boton1 = H7;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(55));

                    H7.setIcon(tablet.getCasillas().get(55).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        A8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(56);
                    Boton1 = A8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(56));

                    A8.setIcon(tablet.getCasillas().get(56).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(57);
                    Boton1 = B8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(57));

                    B8.setIcon(tablet.getCasillas().get(57).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        C8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(58);
                    Boton1 = C8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(58));

                    C8.setIcon(tablet.getCasillas().get(58).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        D8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(59);
                    Boton1 = D8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(59));

                    D8.setIcon(tablet.getCasillas().get(59).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        E8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(60);
                    Boton1 = E8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(60));

                    E8.setIcon(tablet.getCasillas().get(60).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        F8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(61);
                    Boton1 = F8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(61));

                    F8.setIcon(tablet.getCasillas().get(61).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        G8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(62);
                    Boton1 = G8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(62));

                    G8.setIcon(tablet.getCasillas().get(62).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
        H8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                if (count == 1) {
                    Cas1 = tablet.getCasillas().get(63);
                    Boton1 = H8;
                }
                if (count == 2) {
                    tablet.mover(Cas1.getFigura(), tablet.getCasillas().get(63));

                    H8.setIcon(tablet.getCasillas().get(63).getFigura().getImg());
                    Boton1.setIcon(null);

                    count = 0;
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("ajedrezGUI");
        frame.setContentPane(new ajedrezGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
