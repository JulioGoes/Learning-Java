package Trilha_LogicaProgramacao_III_Capgemini;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        // int media = 10;
        // if (media > 7) {
        //     System.out.println("Aprovado");
        // } else {
        //     System.out.println("Reprovado");
        // }
        // String classe_escolhida = "Clérigo";

        // switch (classe_escolhida) {
        //     case "Mago":
        //         System.out.println("Você escolheu a classe Mago!");
        //         break;
        
        //     default:
        //         System.out.println("Você não escolheu a classe Mago!");
        //         break;
        // }

        try (Scanner leitorScanner = new Scanner(System.in)) {
            int numero = leitorScanner.nextInt();

            if ((numero > 99) && (numero < 201)) {
                System.out.println("Este número está entre 100 em 200");
            } else {
                System.out.println("Este número não está entre 100 e 200");
            }
        }
    }
}
