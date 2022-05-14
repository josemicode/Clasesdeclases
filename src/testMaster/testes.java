package testMaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        ArrayList <Integer> amigo = new ArrayList<Integer>();
        ArrayList<String> compa = new ArrayList<String>();

        for (int i = 0; i< 10; i++) {
            amigo.add(i);
            compa.add(sc1.next());
        }

        System.out.println(amigo.get(4));
        System.out.println("Va");
        System.out.println("Ahora si, " + compa.get(sc1.nextInt()) + compa.get(sc1.nextInt()));
    }
}
