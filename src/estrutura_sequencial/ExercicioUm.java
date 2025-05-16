package estrutura_sequencial;

import java.util.Scanner;

public class ExercicioUm {

    public static int int_input(String mensagem){
        Scanner sc = new Scanner(System.in);
        int output;

        System.out.print(mensagem);
        output = sc.nextInt();

        return output;
    }

    public static void main(String[] args){
        int num_01, num_02, soma;

        num_01 = int_input("Insira o primeiro número inteiro: ");
        num_02 = int_input("Insira o segundo número inteiro: ");

        soma = num_01 + num_02;

        System.out.printf("A soma dos dois número é: %d", soma);

    }
}
