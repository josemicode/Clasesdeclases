package herencias.clases;

import herencias.interfaces.iLista;

import java.util.ArrayList;
import java.util.List;

public class Cola implements iLista {

    private List<Integer> cola;
    private int counter = 0;

    public Cola() {
        this.cola = new ArrayList<Integer>();
        this.counter = 0;
    }

    @Override
    public boolean isEmpty() {

        return
                this.cola.isEmpty();
    }

    @Override
    public void push(int pusher) {
        if (!(cola.isEmpty())) {
            if (!(cola.size() == capacidadMax)) {

                cola.add(counter, pusher);
                counter++;
            }
        }else {
            cola.add(pusher);
            counter++;
        }
    }

    @Override
    public int pop() {
        int res = 0;

        res = cola.get(0);
        cola.remove(0);
        counter = cola.size();

        return
                res;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "cola=" + cola +
                ", counter=" + counter +
                '}';
    }
}
