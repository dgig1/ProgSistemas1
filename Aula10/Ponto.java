package Aula10;

public class Ponto {
    // atributos
    private int x;
    private int y;

    // construtor
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // métodos
    public double calculaDistancia(Ponto p) {
        double soma = Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2);
        return Math.sqrt(soma);
    }
    
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
}