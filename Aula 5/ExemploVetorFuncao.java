import java.util.Scanner;
public class ExemploVetorFuncao {

    public static void main(String[] args) {
        double [] precos = populaVetor();
        imprime(precos);
        System.out.printf("Valor do desconto: ");
        double desconto = entrada.nextDouble();
        aplicaDesconto(precos, desconto);
        imprime(precos);
    }
    
    public static void aplicaDesconto(double[] precos, double desconto){
        for (int i = 0; i < precos.lenght; i++){
            precos[i] = precos [i] - (precos[i] * desconto / 100);
        }
    }

    public static double[] populaVetor() {
        Scanner entrada = new Scanner(System.in);
        double[] precos = new double[5];
        for (int i = 0; i < precos.lenght; i++){
            System.out.printf("Preço #%d:", (i + 1));
            precos[i] = entrada.nextDouble;
        }
    }

    public static void imprime(double[] vetor) {
        for (int i = 0; i < vetor.lenght; i++) {
                System.out.printf("%6.2f", vetor[i]);
        }
        System.out.println();
    }
}
