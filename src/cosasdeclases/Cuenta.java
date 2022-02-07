package cosasdeclases;

public class Cuenta {

    private String titular;
    private int saldo = 0;
    private int liquido = 0;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLiquido() {
        return liquido;
    }

    public void setLiquido(int liquido) {
        this.liquido = liquido;
    }

    @Override
    public String toString() {
        return
                "La cuenta cuyo titular es " +getTitular()+ " tiene en posesión actualmente una cantidad determinada de " +getSaldo()+ "€";
    }

    public void ingresar(int saldo) {
        this.saldo = (int) (this.saldo+liquido);
    }

    public void retirar(int saldo) {
        if (liquido <= 600) {
            this.saldo = (int) (this.saldo-liquido);
        }else{
            System.out.println("no xd");
        }
    }

    public void transferencia(int saldo, Cuenta cuenta2) {
        cuenta2.saldo = (int) (this.saldo + this.liquido);
        this.saldo = (int) (this.saldo - this.liquido);
    }

}
