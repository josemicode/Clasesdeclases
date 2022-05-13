package testMaster;

import java.util.ArrayList;

public class testes {
    public static void main(String[] args) {
        ArrayList <Integer> amigo = new ArrayList<Integer>();
        for (int i = 0; i< 10; i++) {
            amigo.add(i);
        }

        System.out.println(amigo.get(4));
    }
}
