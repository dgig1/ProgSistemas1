package Atividade4.Exercicio1;

//Desenvolvido por Danilo Abude Gigliotti RA 10443431

public class TestaCofre {
    public static void main(String[] args) {
        Cofre cofre = new Cofre();
        Moeda m1 = new Moeda(0.50, "50 centavos");
        Moeda m2 = new Moeda(1.00, "1 real");

        cofre.adicionar(m1);
        cofre.adicionar(m2);
        cofre.adicionar(m1);

        System.out.println("Total no cofre: R$" + cofre.calcularTotal());
        System.out.println("Quantidade de moedas de 50 centavos: " + cofre.contarMoedas(m1));
    }
}
