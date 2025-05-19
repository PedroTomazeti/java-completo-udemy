package estrutura_condicional;

import functions.Inputs;

public class ExercicioUm {
    public static void main(String[] args){
        int numero;
        numero = Inputs.intInput("Digite um número inteiro: ");

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
