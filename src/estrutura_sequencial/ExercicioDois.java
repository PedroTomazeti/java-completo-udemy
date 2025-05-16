package estrutura_sequencial;

import java.util.Locale;
import functions.Inputs;

public class ExercicioDois {

    public static double calculaArea(double raio, double pi){

        return pi * Math.pow(raio, 2);
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double raio, area;
        double pi = 3.14159;

        raio = Inputs.doubleInput("Informe o raio do círculo: ");

        area = calculaArea(raio, pi);

        System.out.printf("A=%.4f", area);

    }
}
