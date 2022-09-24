package Exercicios.EstruturaSequencial;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String args[]){
        try (Scanner ler = new Scanner(System.in)) {
            String valor;
            System.out.println("Digite um valor");
            valor = ler.nextLine();
            System.out.println("O valor digitado foi: " + valor);
        }
    }
}
