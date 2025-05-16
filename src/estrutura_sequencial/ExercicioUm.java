package estrutura_sequencial;

import java.util.Scanner;

public class ExercicioUm {

    public static int intInput(String mensagem){
        Scanner sc = new Scanner(System.in);
        int output;

        System.out.print(mensagem);
        output = sc.nextInt();

        return output;
    }

    public static void main(String[] args){
        int num01, num02, soma;

        num01 = intInput("Insira o primeiro número inteiro: ");
        num02 = intInput("Insira o segundo número inteiro: ");

        soma = num01 + num02;

        System.out.printf("A soma dos dois número é: %d", soma);

    }
}
