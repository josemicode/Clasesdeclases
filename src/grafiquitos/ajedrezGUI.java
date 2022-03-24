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

    public ajedrezGUI() throws IOException {

        Tablero tablet = new Tablero();

        Caballo cab1 = new Caballo("n");
        BufferedImage bufferedImage1 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\caballonegro.png"));
        Image imgcabnegro = bufferedImage1.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        cab1.setImg(new ImageIcon(imgcabnegro));
        tablet.getCasillas().get(58).setFigura(cab1);
        cab1.setCas(tablet.getCasillas().get(58));

        B8.setIcon(tablet.getCasillas().get(58).getFigura().getImg());

        Caballo cab2 = new Caballo("b");
        BufferedImage bufferedImage2 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\caballoblanco.png"));
        Image imgcabblanco = bufferedImage2.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        cab2.setImg(new ImageIcon(imgcabblanco));
        tablet.getCasillas().get(1).setFigura(cab2);
        cab2.setCas(tablet.getCasillas().get(1));

        B1.setIcon(tablet.getCasillas().get(1).getFigura().getImg());

        Caballo cab3 = new Caballo("n");
        cab3.setImg(new ImageIcon(imgcabnegro));
        tablet.getCasillas().get(63).setFigura(cab3);
        cab3.setCas(tablet.getCasillas().get(63));

        G8.setIcon(tablet.getCasillas().get(63).getFigura().getImg());

        Caballo cab4 = new Caballo("b");
        cab1.setImg(new ImageIcon(imgcabblanco));
        tablet.getCasillas().get(6).setFigura(cab1);
        cab1.setCas(tablet.getCasillas().get(6));

        G1.setIcon(tablet.getCasillas().get(6).getFigura().getImg());

        Alfil alf1 = new Alfil("n");
        BufferedImage bufferedImage3 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\alfilnegro.png"));
        Image imgalfnegro = bufferedImage3.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        alf1.setImg(new ImageIcon(imgalfnegro));
        tablet.getCasillas().get(59).setFigura(alf1);
        alf1.setCas(tablet.getCasillas().get(59));

        C8.setIcon(tablet.getCasillas().get(59).getFigura().getImg());

        Alfil alf2 = new Alfil("b");
        BufferedImage bufferedImage4 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\alfilblanco.png"));
        Image imgalfblanco = bufferedImage4.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        alf2.setImg(new ImageIcon(imgalfblanco));
        tablet.getCasillas().get(2).setFigura(alf2);
        alf2.setCas(tablet.getCasillas().get(2));

        C1.setIcon(tablet.getCasillas().get(2).getFigura().getImg());

        Alfil alf3 = new Alfil("n");
        alf3.setImg(new ImageIcon(imgalfnegro));
        tablet.getCasillas().get(62).setFigura(alf3);
        alf3.setCas(tablet.getCasillas().get(62));

        F8.setIcon(tablet.getCasillas().get(62).getFigura().getImg());

        Alfil alf4 = new Alfil("b");
        alf4.setImg(new ImageIcon(imgalfblanco));
        tablet.getCasillas().get(5).setFigura(alf4);
        alf4.setCas(tablet.getCasillas().get(5));

        F1.setIcon(tablet.getCasillas().get(5).getFigura().getImg());

        Reina rna1 = new Reina("n");
        BufferedImage bufferedImage5 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reinanegra.png"));
        Image imgrnanegro = bufferedImage5.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        rna1.setImg(new ImageIcon(imgrnanegro));
        tablet.getCasillas().get(3).setFigura(rna1);
        rna1.setCas(tablet.getCasillas().get(3));

        D8.setIcon(tablet.getCasillas().get(3).getFigura().getImg());

        Reina rna2 = new Reina("b");
        BufferedImage bufferedImage6 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reinablanca.png"));
        Image imgrnablanco = bufferedImage6.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        rna2.setImg(new ImageIcon(imgrnablanco));
        tablet.getCasillas().get(60).setFigura(rna2);
        rna2.setCas(tablet.getCasillas().get(60));

        D1.setIcon(tablet.getCasillas().get(60).getFigura().getImg());

        Rey kng1 = new Rey("n");
        BufferedImage bufferedImage7 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reynegro.png"));
        Image imgkngnegro = bufferedImage7.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        kng1.setImg(new ImageIcon(imgkngnegro));
        tablet.getCasillas().get(61).setFigura(kng1);
        kng1.setCas(tablet.getCasillas().get(61));

        E8.setIcon(tablet.getCasillas().get(61).getFigura().getImg());

        Rey kng2 = new Rey("b");
        BufferedImage bufferedImage8 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reyblanco.png"));
        Image imgkngblanco = bufferedImage8.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        kng2.setImg(new ImageIcon(imgkngblanco));
        tablet.getCasillas().get(4).setFigura(kng2);
        kng2.setCas(tablet.getCasillas().get(4));

        E1.setIcon(tablet.getCasillas().get(4).getFigura().getImg());

        Torre trr1 = new Torre("n");
        BufferedImage bufferedImage9 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\torrenegra.png"));
        Image imgtrrnegro = bufferedImage8.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        kng2.setImg(new ImageIcon(imgkngblanco));
        tablet.getCasillas().get(4).setFigura(kng2);
        kng2.setCas(tablet.getCasillas().get(4));

        E1.setIcon(tablet.getCasillas().get(4).getFigura().getImg());

        Rey trr2 = new Rey("b");
        BufferedImage bufferedImage10 = ImageIO.read(new File("C:\\Users\\DAM\\Desktop\\imagenespajava\\reyblanco.png"));
        Image torreblanca = bufferedImage8.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        trr2.setImg(new ImageIcon(torreblanca));
        tablet.getCasillas().get(4).setFigura(kng2);
        trr2.setCas(tablet.getCasillas().get(4));

        E1.setIcon(tablet.getCasillas().get(4).getFigura().getImg());

        A1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        A8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        C8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        D8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        E8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        F8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        G8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        H8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
