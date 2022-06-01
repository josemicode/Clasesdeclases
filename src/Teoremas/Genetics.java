package Teoremas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Genetics {

    static String RandomSequence() {
        char adenine = 'a';
        char guanine = 'g';
        char cytosine = 'c';
        char thymine = 't';

        ArrayList<Character> nBases =  new ArrayList<Character>(Arrays.asList(adenine, guanine, cytosine, thymine));

        Random rd = new Random();

        String res = "";

        for (int i = 0; i<100; i++) {
            if ((i%4==0)&&(i!=0)) {
                res+=" - ";
            }
            res += nBases.get(rd.nextInt(4));
        }

        return res;
    }

    // todo: estudiar y replicar un constructor de genomas humanos

    public static void main(String[] args) {

        System.out.println(RandomSequence());

    }
}
