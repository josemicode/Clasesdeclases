package herencias.clases;

import herencias.abstractas._Figura;

public class Alfil extends _Figura {

    public Alfil(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        for(int i = 1; i<=7; i++) {
            /*
            //System.out.println(casilla2.getNumero());
            //System.out.println(getCas().getNumero());
            //System.out.println(casilla2.getLetra());
            //System.out.println(getCas().getLetra());

            if(((casilla2.getNumero()== (getCas().getNumero() + i)) || (casilla2.getNumero()== (getCas().getNumero() - i)))
                    &&
                     ((casilla2.getLetra()== (getCas().getLetra() + i)) || (casilla2.getLetra()== (getCas().getLetra() - i)))) {

                setCas(casilla2);
            }
            */

            //int counter = 0;
            boolean bool = false;
            //boolean masmenos = false;

            if((casilla2.getLetra()== (getCas().getLetra() + i)) && (casilla2.getNumero()== (getCas().getNumero() + i))){
                System.out.println((casilla2.getPos() - 9) + " pre-for");
                for (int j = getCas().getPos() + 9; j <= (casilla2.getPos() - 9); j+=9){
                    System.out.println(j + " iteracion");
                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {
                        System.out.println("El get j esta lleno");

                        bool = true;
                    }
                }
                if(!bool){
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() + 1)) && (casilla2.getNumero()== (getCas().getNumero() + 1))){
                setCas(casilla2);
                this.movida = true;
            }

            if((casilla2.getLetra()== (getCas().getLetra() + i)) && (casilla2.getNumero()== (getCas().getNumero() - i))){
                System.out.println((casilla2.getPos() - 9) + " pre-for");
                for (int j = getCas().getPos() - 7; j >= (casilla2.getPos() + 7); j-=7){
                    System.out.println(j + " iteracion");
                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {
                        System.out.println("El get j esta lleno");

                        bool = true;
                    }
                }
                if(!bool){
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() + 1)) && (casilla2.getNumero()== (getCas().getNumero() - 1))){
                setCas(casilla2);
                this.movida = true;
            }

            if((casilla2.getLetra()== (getCas().getLetra() - i)) && (casilla2.getNumero()== (getCas().getNumero() + i))){
                System.out.println((casilla2.getPos() - 9) + " pre-for");
                for (int j = getCas().getPos() + 7; j <= (casilla2.getPos() - 7); j+=7){
                    System.out.println(j + " iteracion");
                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {
                        System.out.println("El get j esta lleno");

                        bool = true;
                    }
                }
                if(!bool){
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() - 1)) && (casilla2.getNumero()== (getCas().getNumero() + 1))){
                setCas(casilla2);
                this.movida = true;
            }

            if((casilla2.getLetra()== (getCas().getLetra() - i)) && (casilla2.getNumero()== (getCas().getNumero() - i))){
                System.out.println((casilla2.getPos() - 9) + " pre-for");
                for (int j = getCas().getPos() - 9; j >= (casilla2.getPos() + 9); j-=9){
                    System.out.println(j + " iteracion");
                    if (!(tablas.getCasillas().get(j).getFigura()==null)) {
                        System.out.println("El get j esta lleno");

                        bool = true;
                    }
                }
                if(!bool){
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }else if((casilla2.getLetra()== (getCas().getLetra() - 1)) && (casilla2.getNumero()== (getCas().getNumero() - 1))){
                setCas(casilla2);
                this.movida = true;
            }
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "A-n";
        }else if (getColor().equals("b")){
            res += "A-b";
        }

        return res;
    }
}
