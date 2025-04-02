//Desenvolvido por Danilo Abude Gigliotti RA 10443431//

import java.util.Scanner;
import java.util.Random;

public class OperacoesVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int[] vetor = null;
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Inicializar o vetor com números aleatórios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um número está contido no vetor");
            System.out.println("4. Buscar o maior número armazenado no vetor");
            System.out.println("5. Calcular a média dos números pares");
            System.out.println("6. Calcular o percentual dos números ímpares");
            System.out.println("7. Calcular a média centralizada");
            System.out.println("8. Verificar soma de dois números");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao != 1 && vetor == null) {
                System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Informe o tamanho do vetor: ");
                    int n = entrada.nextInt();
                    System.out.print("Informe o valor máximo M: ");
                    int m = entrada.nextInt();
                    vetor = new int[n];
                    for (int i = 0; i < n; i++) {
                        vetor[i] = random.nextInt(m + 1);
                    }
                    System.out.println("Vetor inicializado com sucesso!");
                    break;
                case 2:
                    imprimirVetor(vetor);
                    break;
                case 3:
                    System.out.print("Informe um número para buscar no vetor: ");
                    int valor = entrada.nextInt();
                    int indice = buscarValor(vetor, valor);
                    if (indice != -1) {
                        System.out.println("Valor encontrado no índice: " + indice);
                    } else {
                        System.out.println("Valor não encontrado no vetor.");
                    }
                    break;
                case 4:
                    System.out.println("Maior número no vetor: " + maiorNumero(vetor));
                    break;
                case 5:
                    System.out.println("Média dos números pares: " + mediaPares(vetor));
                    break;
                case 6:
                    System.out.println("Percentual de números ímpares: " + percentualImpares(vetor) + "%");
                    break;
                case 7:
                    System.out.println("Média centralizada: " + mediaCentralizada(vetor));
                    break;
                case 8:
                    System.out.print("Informe um valor para verificar a soma de dois números: ");
                    int somaValor = entrada.nextInt();
                    System.out.println("Existe par de números que somam " + somaValor + "? " + verificaSoma(vetor, somaValor));
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);

        entrada.close();
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int buscarValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int maiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static double mediaPares(int[] vetor) {
        int soma = 0, count = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                soma += num;
                count++;
            }
        }
        return count == 0 ? 0 : (double) soma / count;
    }

    public static double percentualImpares(int[] vetor) {
        int count = 0;
        for (int num : vetor) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return ((double) count / vetor.length) * 100;
    }

    public static double mediaCentralizada(int[] vetor) {
        int maior = maiorNumero(vetor);
        int menor = vetor[0];
        for (int num : vetor) {
            if (num < menor) {
                menor = num;
            }
        }
        int soma = 0, count = 0;
        boolean menorRemovido = false, maiorRemovido = false;
        for (int num : vetor) {
            if (num == menor && !menorRemovido) {
                menorRemovido = true;
                continue;
            }
            if (num == maior && !maiorRemovido) {
                maiorRemovido = true;
                continue;
            }
            soma += num;
            count++;
        }
        return count == 0 ? 0 : (double) soma / count;
    }

    public static boolean verificaSoma(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] + vetor[j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}
