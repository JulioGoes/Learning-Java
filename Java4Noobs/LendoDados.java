package Java4Noobs;

import java.util.Scanner;

public class LendoDados {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite sua classe: ");
            String nome = leitor.nextLine();
            System.out.print("Digite seu nível: ");
            int nivel = leitor.nextInt();
            System.out.println("Classe: " + nome + " | Nível: " + nivel);
        }
    }
}
