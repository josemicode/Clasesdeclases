package herencias.clases;

import herencias.abstractas._Figura;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private List<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<Casilla>();

        for(int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                if(j==0){
                    casillas.add(new Casilla(i, 'A'));
                }
                if(j==1){
                    casillas.add(new Casilla(i, 'B'));
                }
                if(j==2){
                    casillas.add(new Casilla(i, 'C'));
                }
                if(j==3){
                    casillas.add(new Casilla(i, 'D'));
                }
                if(j==4){
                    casillas.add(new Casilla(i, 'E'));
                }
                if(j==5){
                    casillas.add(new Casilla(i, 'F'));
                }
                if(j==6){
                    casillas.add(new Casilla(i, 'G'));
                }
                if(j==7){
                    casillas.add(new Casilla(i, 'H'));
                }
            }
        }
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }

    @Override
    public String toString() {
        String res = "";

        for(int j = 0; j < 8; j++) {
            for (int i = 0+j*8; i < 8+j*8; i++) {
                res += casillas.get(i) + " ";
            }
            res+="\n";
        }
        return
                res;
    }

    public void mover(_Figura figura, Casilla casilla2) {

        for (int i = 0; i<64; i++) {
            if((getCasillas().get(i).getLetra() == figura.getCas().getLetra()) && (getCasillas().get(i).getNumero() == figura.getCas().getNumero())) {

                getCasillas().get(i).setFigura(null);
            }
        }

        figura.movimiento(casilla2);

        for (int i = 0; i<64; i++) {
            if((getCasillas().get(i).getLetra() == figura.getCas().getLetra()) && (getCasillas().get(i).getNumero() == figura.getCas().getNumero())) {

                getCasillas().get(i).setFigura(figura);
            }
        }
    }

}
