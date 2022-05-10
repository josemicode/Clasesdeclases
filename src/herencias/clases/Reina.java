package herencias.clases;

import herencias.abstractas._Figura;

public class Reina extends _Figura {

    public Reina(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        /*for(int i = 1; i<=7; i++) {
            if((((casilla2.getNumero()== getCas().getNumero() + i) || (casilla2.getNumero()== getCas().getNumero() - i)) && ((casilla2.getLetra()== getCas().getLetra() + i) || (casilla2.getLetra()== casilla2.getLetra() - i))) || ((getCas().getLetra() == casilla2.getLetra())||(getCas().getNumero() == casilla2.getNumero()))) {
                setCas(casilla2);
            }
        }*/

        boolean bool = false;

        for(int i = 1; i<=7; i++) {

            if((casilla2.getLetra()== (getCas().getLetra() + i)) && (casilla2.getNumero()== (getCas().getNumero() + i))){

                for (int j = getCas().getPos() + 9; j <= (casilla2.getPos() - 9); j+=9){

                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {


                        bool = true;
                    }
                }
                if(!bool){
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() + 1)) && (casilla2.getNumero()== (getCas().getNumero() + 1))){
                if (casilla2.getFigura()==null) {

                    setCas(casilla2);
                    this.movida = true;

                }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if((casilla2.getLetra()== (getCas().getLetra() + i)) && (casilla2.getNumero()== (getCas().getNumero() - i))){

                for (int j = getCas().getPos() - 7; j >= (casilla2.getPos() + 7); j-=7){

                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {


                        bool = true;
                    }
                }
                if(!bool){
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() + 1)) && (casilla2.getNumero()== (getCas().getNumero() - 1))){
                if (casilla2.getFigura()==null) {

                    setCas(casilla2);
                    this.movida = true;

                }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if((casilla2.getLetra()== (getCas().getLetra() - i)) && (casilla2.getNumero()== (getCas().getNumero() + i))){

                for (int j = getCas().getPos() + 7; j <= (casilla2.getPos() - 7); j+=7){

                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {


                        bool = true;
                    }
                }
                if(!bool){
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() - 1)) && (casilla2.getNumero()== (getCas().getNumero() + 1))){
                if (casilla2.getFigura()==null) {

                    setCas(casilla2);
                    this.movida = true;

                }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if((casilla2.getLetra()== (getCas().getLetra() - i)) && (casilla2.getNumero()== (getCas().getNumero() - i))){

                for (int j = getCas().getPos() - 9; j >= (casilla2.getPos() + 9); j-=9){

                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {


                        bool = true;
                    }
                }
                if(!bool){
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() - 1)) && (casilla2.getNumero()== (getCas().getNumero() - 1))){
                if (casilla2.getFigura()==null) {

                    setCas(casilla2);
                    this.movida = true;

                }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }
        }

        if (getCas().getNumero() == casilla2.getNumero()) {
            if (casilla2.getPos() > getCas().getPos()) {
                for (int i = getCas().getPos() + 1; i < casilla2.getPos(); i++) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }

            if (casilla2.getPos() < getCas().getPos()) {
                for (int i = getCas().getPos() - 1; i > casilla2.getPos(); i--) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }
        }else if (((casilla2.getNumero() == getCas().getNumero() + 1) && (casilla2.getLetra() == getCas().getLetra()))
                ||
                ((casilla2.getNumero() == getCas().getNumero() - 1) && (casilla2.getLetra() == getCas().getLetra()))
                ||
                ((casilla2.getNumero() == getCas().getNumero()) && (casilla2.getLetra() == getCas().getLetra() + 1))
                ||
                ((casilla2.getNumero() == getCas().getNumero()) && (casilla2.getLetra() == getCas().getLetra() - 1))){
            if (casilla2.getFigura()==null) {

                setCas(casilla2);
                this.movida = true;


            }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                setCas(casilla2);
                this.movida = true;

            }
        }

        if (getCas().getLetra() == casilla2.getLetra()) {
            if (casilla2.getPos() > getCas().getPos()) {
                for (int i = getCas().getPos() + 8; i < casilla2.getPos(); i+=8) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }

            if (casilla2.getPos() < getCas().getPos()) {
                for (int i = getCas().getPos() - 8; i > casilla2.getPos(); i-=8) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    if (casilla2.getFigura()==null) {

                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;

                    }if ((casilla2.getFigura()!=null) && !(color.equals(casilla2.getFigura().getColor()))) {
                        setCas(casilla2);
                        this.movida = true;
                        bool=!bool;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "Q-n";
        }else if (getColor().equals("b")){
            res += "Q-b";
        }

        return res;
    }
}
