package estrutura_sequencial;

import functions.Inputs;

public class ExercicioUm {

    public static void main(String[] args){
        int num01, num02, soma;
        num01 = Inputs.intInput("Insira o primeiro número inteiro: ");
        num02 = Inputs.intInput("Insira o segundo número inteiro: ");

        soma = num01 + num02;

        System.out.printf("A soma dos dois número é: %d", soma);

    }
}
