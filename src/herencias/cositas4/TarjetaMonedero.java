package herencias.cositas4;

public interface TarjetaMonedero {

                                                //Métodos a ser implementados
    public void comprar(double importe, String dni);

    public String getId();

    public String getDniTitular();

    public double getSaldo();

    public void setPin(int pin);

    void retirar(double importe, int pin2);
}
