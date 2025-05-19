package estrutura_condicional;

import functions.Inputs;

public class ExercicioQuatro {
    public static void main(String[] args){
        int inicio, fim, res;

        inicio = Inputs.intInput("Insira o horário de inicio do jogo: ");
        fim = Inputs.intInput("Insira o horário final do jogo: ");

        if (inicio >= fim){
            res = 24 - (inicio - fim);
        } else {
            res = fim - inicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", res);

    }
}
