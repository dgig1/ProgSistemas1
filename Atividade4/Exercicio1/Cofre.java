package Atividade4.Exercicio1;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

import java.util.ArrayList;

public class Cofre {
    private ArrayList<Moeda> moedas;

    public Cofre() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda m) {
        moedas.add(m);
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.getValor();
        }
        return total;
    }

    public int contarMoedas(Moeda m) {
        int count = 0;
        for (Moeda moeda : moedas) {
            if (moeda.equals(m)) {
                count++;
            }
        }
        return count;
    }
}