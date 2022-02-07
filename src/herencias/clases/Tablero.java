package herencias.clases;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private List<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<Casilla>();

        for(int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                if(j==0){
                    casillas.add(new Casilla(i, 'A', null));
                }
                if(j==1){
                    casillas.add(new Casilla(i, 'B', null));
                }
                if(j==2){
                    casillas.add(new Casilla(i, 'C', null));
                }
                if(j==3){
                    casillas.add(new Casilla(i, 'D', null));
                }
                if(j==4){
                    casillas.add(new Casilla(i, 'E', null));
                }
                if(j==5){
                    casillas.add(new Casilla(i, 'F', null));
                }
                if(j==6){
                    casillas.add(new Casilla(i, 'G', null));
                }
                if(j==7){
                    casillas.add(new Casilla(i, 'H', null));
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

    //public void sacarPieza(String letra, int num) {
    //    getCasillas().get()
    //}
}
