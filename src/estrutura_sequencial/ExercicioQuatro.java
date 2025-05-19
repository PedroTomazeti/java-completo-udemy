package estrutura_sequencial;

import java.util.Locale;
import functions.Inputs;

public class ExercicioQuatro {

    public static double calcSal(double salPerHour, int numHour){
        return salPerHour * numHour;
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int idFunc, numHour;
        double salPerHour, salFinal;
        idFunc = Inputs.intInput("Forneça seu número de funcionário: ");
        numHour = Inputs.intInput("Quantas horas trabalhadas você possui? ");
        salPerHour = Inputs.doubleInput("Quanto por hora você recebe? ");

        salFinal = calcSal(salPerHour, numHour);

        System.out.printf("NUMBER = %d\n", idFunc);
        System.out.printf("SALARY: U$ %.2f", salFinal);
    }
}
