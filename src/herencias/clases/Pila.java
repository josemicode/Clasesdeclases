package herencias.clases;

import herencias.interfaces.iLista;

import java.util.ArrayList;
import java.util.List;

public class Pila implements iLista {

    private List<Integer> pila;

    public Pila() {
        this.pila = new ArrayList<Integer>();

    }

    @Override
    public boolean isEmpty() {

        return
                this.pila.isEmpty();
    }

    @Override
    public void push(int pusher) {
        if (!(pila.isEmpty())) {
            if (!(pila.size() == capacidadMax)) {

                pila.add(pusher);

            }
        }else {
            pila.add(pusher);
        }
    }

    @Override
    public int pop() {
        int res = 0;

        res = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);

        return
                res;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }
}
