package Aula9;

public class Circulo {
    // atributos
    private double raio;
    private Ponto centro;

    // construtor
    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }


    // métodos
    public boolean estaContido(Ponto p) {
        double distancia = centro.calculaDistancia(p);
        System.out.println(distancia);
        return distancia <= raio;
    }


    public double getRaio() {
        return raio;
    }
}
