package Teoremas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HareTortoise {

    static int findDuplicate(ArrayList<Integer> nums) {

        int tortoise = nums.get(0);
        int hare = nums.get(0);

        while (true) {

            tortoise = nums.get(tortoise);
            hare = nums.get(nums.get(hare));

            if (tortoise == hare) {
                break;
            }
        }

        int v1 = nums.get(0);
        int v2 = tortoise;

        while (v1 != v2) {
            v1 = nums.get(v1);
            v2 = nums.get(v2);
        }

        return v1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> casoLista1 = new ArrayList<Integer>(Arrays.asList(3, 1, 3, 4, 2));

        ArrayList<Integer> casoLista2 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 4, 3));

        ArrayList<Integer> casoLista3 = new ArrayList<Integer>(Arrays.asList(5, 2, 2, 1, 4));

        ArrayList<Integer> casoLista4 = new ArrayList<Integer>(Arrays.asList(5, 2, 2, 1, 4, 3));

        System.out.println(findDuplicate(casoLista1));      //Caso estándar
        System.out.println(findDuplicate(casoLista2));      //Caso en el que el número duplicado no se encuentra en la posición origen
        //System.out.println(findDuplicate(casoLista3));    //Obviamente deben de incluirse numeros que no indiquen espacios de memoria que excedan la lista
        System.out.println(findDuplicate(casoLista4));      //Comprobacion con más números
    }
}
