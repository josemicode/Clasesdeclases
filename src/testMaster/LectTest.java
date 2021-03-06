package testMaster;

import java.io.*;
import java.util.Scanner;

public class LectTest {

    private File fil1;
    private Scanner sc1;
    private int Score;
    private LineNumberReader reader1;
    private int LineNumber;
    private double media;

    public LectTest(String nombreAr) throws IOException {

        this.fil1 = new File(nombreAr);
        this.sc1 = new Scanner(fil1);
        this.reader1 = new LineNumberReader(new FileReader(fil1));

        String str;
        while ((str = reader1.readLine()) != null){
            this.LineNumber++;
        }
    }

    public void Impresion() { //todo: Crear una Matriz que randomice la seleccion de preguntas almacenando previamente los datos resultantes de las lecturas en una lista de cadenas de texto
        String res = "";
        double points = 0;
        double questCount = 0;
        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i<LineNumber; i++) {

            if (((i+1)%6)==0) {
                res = sc2.next();
                String resp = sc1.nextLine();
                if (resp.equalsIgnoreCase(res)) {
                    System.out.println("Correcto");
                    points++;
                }else{
                    System.out.println("Incorrecto, " + "la respuesta correcta es: '" + resp +"'");
                }
                questCount++;
            }else{
                System.out.println(sc1.nextLine());
            }

        }

        setScore((int) points);

        System.out.println("Has obtenido una puntuacion de "+ getScore() + " sobre "+ (int)questCount +", es decir: un " + calcMedia(questCount, points));
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public double calcMedia(double questNum, double nota) {
        double res;
        res = (double) (10*(nota / questNum));
        return res;
    }
}
