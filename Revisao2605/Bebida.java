package Revisao2605;

public class Bebida {
    
    private String descrição;
    private double valor;

    public void setDescrição(String valor) {
        descrição += valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public double calcValorAPagar() {
        return valor;
    }
}
