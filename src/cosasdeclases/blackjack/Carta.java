package cosasdeclases.blackjack;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Carta {

    private int palo;
    private int num;
    private int val;
    private ImageIcon fotocarta;
    private boolean rev;

    public Carta(ImageIcon fotocarta) {
        this.fotocarta = fotocarta;
        this.rev = rev;
        this.palo = palo;
        this.num = num;
        if (num==11||num==12||num==13) {
            this.val = 10;
        }else{
            this.val = this.num;
        }
    }

    public Carta(int palo, int num) {
        this.palo = palo;
        this.num = num;
        if (num==11||num==12||num==13) {
            this.val = 10;
        }else{
            this.val = this.num;
        }
    }

    public boolean isRev() {
        return rev;
    }

    public void setRev(boolean rev) {
        this.rev = rev;
    }

    public ImageIcon getFotocarta() {
        return fotocarta;
    }

    public void setFotocarta(ImageIcon fotocarta) {
        this.fotocarta = fotocarta;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String leerpalo() {
        String res = "xd";
        if(this.palo == 0){
            res = "corazones";
        }if (this.palo == 1){
            res = "picas";
        }if (this.palo == 2){
            res = "diamantes";
        }if (this.palo == 3){
            res = "tréboles";
        }
        return res;
    }

    public String valtoString() {
        String res = String.valueOf(num);
        if (num==11) {
            res = "sota";
        }if (num==12) {
            res = "caballo";
        }if (num==13) {
            res = "rey";
        }
        return
                res;
    }
    @Override
    public String toString() {
        return
                "Tu carta es un " +num+ " de " +leerpalo()+" ("+valtoString()+")";
    }
}