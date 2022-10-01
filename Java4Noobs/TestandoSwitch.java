package Java4Noobs;

import java.util.Scanner;

public class TestandoSwitch {
    public static void main(String[] args) {
        System.out.println("ESCOLHA DE CLASSE\n(1) Homem-de-Armas\n(2) Clérigo\n(3) Mago\n(4) Ladrão");
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Escolha uma classe: ");
            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                System.out.println("Você escolheu Homem-de-Armas");
                break;
                
                case 2:
                System.out.println("Você escolheu Clérigo");
                break;

                case 3:
                System.out.println("Você escolheu Mago");
                break;

                case 4:
                System.out.println("Você escolheu Ladrão");
                break;

                default:
                System.out.println("Valor Inválido");
            }
        }

    }
}
