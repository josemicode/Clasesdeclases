package cosasdeclases;

import java.util.Random;

import static java.lang.Math.*;

public class Humano {

    private int dni;
    private Double altura;
    private Double peso;
    private Double IMC;
    private int edad;
    private String sexo;
    private boolean masc;
    private boolean fem;
    private String nombre;
    private String apellidos;
    private String todo;

    public Humano(Double altura, Double peso, String sexo, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.edad = edad;

    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getIMC() {
        return IMC;
    }

    public void setIMC(Double IMC) {
        this.IMC = IMC;
    }

    public Double calcularIMC() {
        this.IMC = this.peso/(pow(this.altura, 2));
        return this.IMC;
    }

    public void obtenerClasificacionOMS() {
        System.out.println("Tu IMC es: " + this.IMC + " pero como todos somos perfectos no te juzgo");
    }

    public void esMayordeEdad() {
        if (this.edad>=18) {
            System.out.println("Felicidades, eres legalmente responsable");
        }
    }

    public void comprobarSexo() {
        if(this.sexo.equals("femenino")){

            System.out.println("Pues tu sexo es femenino");
            fem = true;
            masc = false;
        }else if(this.sexo.equals("masculino")){

            System.out.println("Pues tu sexo es masculino");
            masc= true;
            fem = false;
        }
    }

    public void generarDNI() {

        Random rd = new Random();

        dni = (int) rd.nextInt(8);
        int dninumbers = this.dni%23;
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = secuencia.charAt(this.dni);
        todo = String.valueOf(this.dni + letra);
    }

    @Override
    public String toString() {
        return "Usted es de sexo " +this.sexo+ ", pesa " +this.peso+ ", su IMC es " +this.IMC+ ". Ademas tu dni es: " +todo;
    }
}
