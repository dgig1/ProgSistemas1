package Aula10;

public class Programa {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(30, 12);
        Circulo c = new Circulo(new Ponto(2, 5), 2.0);
        boolean contido = c.estaContido(p1);
        System.out.println(contido);
    }
}
