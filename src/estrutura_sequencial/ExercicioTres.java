package estrutura_sequencial;

import functions.Inputs;

public class ExercicioTres {

    public static int diferenca(int a, int b, int c, int d){

        return (a * b - c * d);
    }

    public static void main(String[] args){
        int a, b, c, d, diff;

        a = Inputs.intInput("Primeiro número: ");
        b = Inputs.intInput("Segundo número: ");
        c = Inputs.intInput("Terceiro número: ");
        d = Inputs.intInput("Quarto número: ");

        diff = diferenca(a, b, c, d);

        System.out.printf("DIFERENCA = %d", diff);

    }
}
