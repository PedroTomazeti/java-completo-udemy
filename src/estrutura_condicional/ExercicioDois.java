package estrutura_condicional;

import functions.Inputs;

public class ExercicioDois {

    public static int imparPar(int numero){
        return numero % 2;
    }

    public static void main(String[] args){
        int num, resultado;
        num = Inputs.intInput("Digite o número inteiro da sua escolha: ");

        resultado = imparPar(num);

        if (resultado == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
