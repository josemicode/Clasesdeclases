package herencias.clases;

import java.util.List;

public class Desbordamiento {

    private int[] abordo = {1,2,3,4};

    public Desbordamiento() {
        this.abordo = abordo;
    }

    public String mostrarArr(int legs) {

        String res = "";

        for(int i = 0; i < legs; i++){

            res+= abordo[i];

            if (!(i==legs-1)){
                res+=", ";
            }
        }

        return
                res;
    }
}
