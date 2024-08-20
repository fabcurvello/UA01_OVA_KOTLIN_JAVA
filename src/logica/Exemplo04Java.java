package logica;

import java.util.Scanner;

public class Exemplo04Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a cor do semáforo neste momento? ");
        String cor = scanner.nextLine().toLowerCase();
        switch (cor) {
            case "verde":
                System.out.println("Siga em frente.");
                break;
            case "amarelo":
                System.out.println("Atenção, prepare-se para parar.");
                break;
            case "vermelho":
                System.out.println("Pare.");
                break;
            default:
                System.out.println("Cor não existente nos semáforos.");
        }
        scanner.close();
    }
}
