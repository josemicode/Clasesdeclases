package cosasdeclases;

public class Fecha {

    private int dia = 1;
    private int mes = 1;
    private int ano = 1;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return
                getDia()+ "/" +getMes()+ "/" +getAno();
    }

    public void add() {
        if((this.mes==1)||(this.mes==3)||(this.mes==5)||(this.mes==7)||(this.mes==8)||(this.mes==10)){
            if(this.dia==31){
                this.mes++;
                this.dia = 1;
            }else{
                this.dia++;
            }
        }
        if((this.mes==4)||(this.mes==6)||(this.mes==9)||(this.mes==11)){
            if(this.dia==30){
                this.mes++;
                this.dia = 1;
            }else{
                this.dia++;
            }
        }
        if((this.mes==2)){
            if(this.dia==28){
                this.mes++;
                this.dia = 1;
            }else{
                this.dia++;
            }
        }
        if((this.mes==12)){
            if(this.dia==31){
                this.ano++;
                this.mes = 1;
                this.dia = 1;
            }else{
                this.dia++;
            }
        }
    }
    public void sub() {
        if((this.mes==2)||(this.mes==4)||(this.mes==6)||(this.mes==8)||(this.mes==9)||(this.mes==11)){
            if(this.dia==1){
                this.mes--;
                this.dia = 31;
            }else{
                this.dia--;
            }
        }
        if((this.mes==5)||(this.mes==7)||(this.mes==10)||(this.mes==12)){
            if(this.dia==1){
                this.mes--;
                this.dia =  30;
            }else{
                this.dia--;
            }
        }
        if((this.mes==3)){
            if(this.dia==1){
                this.mes--;
                this.dia = 28;
            }else{
                this.dia--;
            }
        }
        if((this.mes==1)){
            if(this.dia==1){
                this.ano--;
                this.mes = 12;
                this.dia = 31;
            }else{
                this.dia--;
            }
        }
    }
}
