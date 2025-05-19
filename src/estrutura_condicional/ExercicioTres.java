package estrutura_condicional;

import functions.Inputs;

public class ExercicioTres {
    public static void main(String[] args){
        int num1, num2, resultado;

        num1 = Inputs.intInput("A= ");
        num2 = Inputs.intInput("B= ");

        if (num1 >= num2){
            resultado = num1 % num2;
        } else {
            resultado = num2 % num1;
        }

        if (resultado == 0){
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não São Múltiplos");
        }

    }
}
