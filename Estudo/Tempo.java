//Exercício 5 - Lista 2//
import java.util.Scanner 

public class Tempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); {

        System.out.print("Digite a quantidade de segundos:") ; 
        int totalSegundos = Scanner.nextInt(); 

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60 ;

        System.out.printf("Equivale a %02d:%02d:%02d\n" horas, minutos, segundos) ;

        }
    }
}
