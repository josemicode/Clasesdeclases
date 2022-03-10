package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculatorGUI extends JFrame {
    private JButton Siete;
    private JButton Uno;
    private JButton Cuatro;
    private JButton Ocho;
    private JButton Cinco;
    private JButton Dos;
    private JButton Nueve;
    private JButton Seis;
    private JButton Tres;
    private JButton Sumar;
    private JButton Restar;
    private JButton Multiplicar;
    private JButton Dividir;
    private JButton Delete;
    private JPanel mainPanel;
    private JLabel Num;
    private JButton Zero;
    private JLabel Signo;
    private JButton Igual;
    private JLabel Denum;
    private JButton Cambio;
    private JLabel Result;
    private JButton Punto;

    private double resultado = 0;

    private boolean sw = true;

    private String textito = Num.getText();
    private String textote = Denum.getText();
    private String signo = Signo.getText();


    public calculatorGUI(){

        //Toolkit mipantalla = Toolkit.getDefaultToolkit();
        //Dimension tamano = mipantalla.getScreenSize();
        //int alturapant = tamano.height;
        // int pant2 = tamano.width;


        Uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Uno.getText();
                    Num.setText(textito);

                    //resultado = Double.parseDouble(textito);

                }else{
                    textote += Uno.getText();
                    Denum.setText(textote);

                    //resultado = Double.parseDouble(textote);
                }
            }
        });
        Dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Dos.getText();
                    Num.setText(textito);
                }else{
                    textote += Dos.getText();
                    Denum.setText(textote);
                }
            }
        });
        Tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Tres.getText();
                    Num.setText(textito);
                }else{
                    textote += Tres.getText();
                    Denum.setText(textote);
                }
            }
        });
        Cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Cuatro.getText();
                    Num.setText(textito);
                }else{
                    textote += Cuatro.getText();
                    Denum.setText(textote);
                }
            }
        });
        Cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Cinco.getText();
                    Num.setText(textito);
                }else{
                    textote += Cinco.getText();
                    Denum.setText(textote);
                }
            }
        });
        Seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Seis.getText();
                    Num.setText(textito);
                }else{
                    textote += Seis.getText();
                    Denum.setText(textote);
                }
            }
        });
        Siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Siete.getText();
                    Num.setText(textito);
                }else{
                    textote += Siete.getText();
                    Denum.setText(textote);
                }
            }
        });
        Ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Ocho.getText();
                    Num.setText(textito);
                }else{
                    textote += Ocho.getText();
                    Denum.setText(textote);
                }
            }
        });
        Nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Nueve.getText();
                    Num.setText(textito);
                }else{
                    textote += Nueve.getText();
                    Denum.setText(textote);
                }
            }
        });
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textito = "";
                textote = "";
                Num.setText(textito);
                Denum.setText(textote);
                Result.setText("");
                Signo.setText("");
            }
        });
        Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signo.setText("+");
                resultado = Double.parseDouble(textito) + Double.parseDouble(textote);
            }
        });
        Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signo.setText("-");
                resultado = Double.parseDouble(textito) - Double.parseDouble(textote);
            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signo.setText("x");
                resultado = Double.parseDouble(textito) * Double.parseDouble(textote);
            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signo.setText("/");
                resultado = Double.parseDouble(textito) / Double.parseDouble(textote);
            }
        });
        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Zero.getText();
                    Num.setText(textito);
                }else{
                    textote += Zero.getText();
                    Denum.setText(textote);
                }
            }
        });
        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(String.valueOf(resultado));
            }
        });
        Cambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sw = !sw;
            }
        });
        Punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sw){
                    textito += Punto.getText();
                    Num.setText(textito);
                }else{
                    textote += Punto.getText();
                    Denum.setText(textote);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorGUI");
        frame.setContentPane(new calculatorGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setResizable(false);
    }
}
