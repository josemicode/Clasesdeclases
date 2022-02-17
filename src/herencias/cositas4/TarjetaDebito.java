package herencias.cositas4;

public interface TarjetaDebito {

                                        //Métodos a ser implementados

    public void comprar(double importe, String dni);

    public void retirar(double importe, int pin);

    public String getId();

    public String getDniTitular();

    public double getSaldo();

    public void setPin(int pin);
}
