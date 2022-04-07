package herencias.clases;

import herencias.abstractas._Figura;

public class Casilla {

    private char letra;
    private int numero;
    private boolean llena;
    private _Figura figura;
    protected int Pos;

    public int getPos() {
        return Pos;
    }

    public void setPos(int pos) {
        Pos = pos;
    }

    public Casilla(int numero, char letra) {

        this.letra = letra;
        this.numero = numero;

        this.figura = figura;

        if(figura != null) {
            this.llena = true;
        }else{
            this.llena = false;
        }
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLlena() {
        return llena;
    }

    public void setLlena(boolean llena) {
        this.llena = llena;
    }

    public _Figura getFigura() {
        return figura;
    }

    public void setFigura(_Figura figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        String res = "";
        if(figura!=null){
            res = letra + String.valueOf(numero) + "(" + figura + ")";
        }else{
            res = letra + String.valueOf(numero);
        }
        return res;
    }
}
