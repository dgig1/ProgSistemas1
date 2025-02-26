import java.util.Scanner;

public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); {
            int qtdPublicacoes
            do {
                System.out.print("Número de publicações: ");
                qtdPublicacoes = entrada.nextInt();
                if (qtdPublicacoes <= 0) {
                    System.out.println("\tInforme um número positivo")
                }
            }
            int totalCurtidas = 0; //acumuladora
            for (int i = 1; i <= qtdPublicacoes; i++) 
                System.out.printf("Número de curtidas da publicação #%d: ", i);
                int qtdCurtidas = entrada.nextInt();
                totalCurtidas = totalCurtidas + qtdCurtidas;
                if (qtdCurtidas >= 100) {
                    System.out.println("Sua publicação é popular!");
                }
                else {
                    System.out.println("Sua publicação não é popular.");
                }
            }
            double mediaCurtidas = (double) totalCurtidas / qtdPublicacoes;
            System.out.printf("A média de curtidas é: %.1f\n", mediaCurtidas) ;           
            System.out.printf("Número de publicações: %d\n", qtdPublicacoes);

        entrada.close();
        }    
    } 
        
}