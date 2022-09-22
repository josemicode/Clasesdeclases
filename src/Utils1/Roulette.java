package Utils1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roulette {

    private ArrayList<String> lista;

    public Roulette() {
        lista = new ArrayList<String>();
    }

    public Roulette(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void addElement(String el) {
        lista.add(el);
    }
    
    public String spin() {
        String res = "";
        Random rd = new Random();
        res = lista.get(rd.nextInt(lista.size()));
        return res;
    }
}
