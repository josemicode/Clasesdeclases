package Cositas;

import Utils1.Roulette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DBDrule {
    public static void main(String[] args) {

        ArrayList<String> Perks = new ArrayList<String>(Arrays.asList(
                "Dead Hard","Head on","Borrow Time","Iron Will","Kindred","Spine Chill","Unbreakable",
                "Adrenaline","Prove Thy","Sprint Burst",
                "We'll Make It","Bond","WGLF","Inner Strength",
                "Botany","Empathy","Urban",
                "Self-Care","Plunder",
                "Hope","Dark Sense","Leader",
                "Self-Preservation","Deja Vu","Track",
                "Lightweight",
                "Empathic Connection","Calm Spirit",
                "Guardian","Kinship","Left Behind","Slippery","No Mither",
                "NOLB"
        ));

        Roulette rule = new Roulette(Perks);

        System.out.println(rule.spin());
        System.out.println(rule.spin());
        System.out.println(rule.spin());
        System.out.println(rule.spin());
    }
}
