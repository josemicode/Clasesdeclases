package herencias.cositas4;

public class Tarjeta implements TarjetaMonedero{
                                                    //Atributos
    private String id;
    private String dniTitular;
    private int pin;
    private double saldo;

                                                    //Constructor
    public Tarjeta(String id, String dniTitular, int pin, double saldo) {
        this.id = id;
        this.dniTitular = dniTitular;
        this.pin = pin;
        this.saldo = saldo;
    }
                                                    //Métodos implementados de las interfaces
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDniTitular() {
        return dniTitular;
    }

    @Override
    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
                                                    //Métodos de doble parámetro que modifican valores y no devuelven nada
    @Override
    public void comprar(double importe, String dni) {
        if ((importe <= this.saldo)&&(dni.equals(dniTitular))) {
            saldo-=importe;
        }
    }
    @Override
    public void retirar(double importe, int pin2) {
        if ((importe <= this.saldo)&&(pin2==this.pin)) {
            saldo-=importe;
        }
    }
                                                    //Método de un solo parámetro que devuelve un booleano y modifica un valor
    public boolean cargo(double importe) {
        boolean res = false;

        if (importe <= this.saldo) {
            saldo-=importe;
            res = true;
        }

        return
                res;
    }
}
