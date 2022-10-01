package Java4Noobs;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            boolean condicao = false;
            int escolha;
            int num_um;
            int num_dois;
            int soma;
            int subtrair;
            int multiplicar;
            double dividir;
            double modulo;

            while (condicao == false){
                System.out.println("CALCULADORA DE DOIS NÚMEROS");
                System.out.println("(1) Somar");
                System.out.println("(2) Subtrair");
                System.out.println("(3) Multiplicar");
                System.out.println("(4) Dividir");
                System.out.println("(5) Módulo");
                System.out.println("(0) Sair");

                escolha = leitor.nextInt();

                if (escolha > 1 && escolha < 6){
                    System.out.print("Digite o primeiro número: ");
                    num_um = leitor.nextInt();
                    System.out.print("Digite o segundo número número: ");
                    num_dois = leitor.nextInt();

                    switch (escolha) {
                        case 1:
                        soma = num_um + num_dois;
                        System.out.println("O resultado da soma é: " + soma);
                        break;

                        case 2:
                        subtrair = num_um - num_dois;
                        System.out.println("O resultado da subtração é: " + subtrair);
                        break;

                        case 3:
                        multiplicar = num_um * num_dois;
                        System.out.println("O resultado da multiplicação é: " + multiplicar);
                        break;

                        case 4:
                        dividir = num_um / num_dois;
                        System.out.println("O resultado da divisão é: " + dividir);
                        break;

                        case 5:
                        modulo = num_um % num_dois;
                        System.out.println("O resultado do módulo é: " + modulo);
                        break;
                    }
                } else if (escolha == 0) {
                    System.out.println("Bye ^^");
                    condicao = true;
                } else {
                    System.out.println("Valor Inválido!");
                }

            }
        }
    }
}
