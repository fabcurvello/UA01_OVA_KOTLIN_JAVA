package logica;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double nota1, nota2, nota3, media;
        String situacao;

        System.out.println("Informe a nota 1: ");
        nota1 = scanner.nextDouble();
        System.out.println("Informe a nota 2: ");
        nota2 = scanner.nextDouble();
        System.out.println("Informe a nota 3: ");
        nota3 = scanner.nextDouble();

        media = ( nota1 + nota2 + nota3 ) / 3;

        if ( media >= 7 ) {
            situacao = "Aprovado(a)";
        } else if ( media >= 4 ) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado(a)";
        }

        System.out.printf("Média: %.1f - Situação: %s", media, situacao);
        scanner.close();
    }
}
