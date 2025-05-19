package estrutura_sequencial;

import functions.Inputs;

import java.util.Locale;

public class ExercicioCinco {

    public static double calcPreco(double subTotal1, double subTotal2){
        return subTotal1 + subTotal2;
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int codigoPc1, codigoPc2, quantPc1, quantPc2;
        double precoProd1, precoProd2, total;

        codigoPc1 = Inputs.intInput("Insira código do Produto 1: ");
        quantPc1 = Inputs.intInput("Informe quantidade desejada do Produto 1: ");
        precoProd1 = Inputs.doubleInput("Quanto vale o Produto 1? ");
        codigoPc2 = Inputs.intInput("Insira código do Produto 2: ");
        quantPc2 = Inputs.intInput("Informe quantidade desejada do Produto 2: ");
        precoProd2 = Inputs.doubleInput("Quanto vale o Produto 2? ");

        total = calcPreco(quantPc1 * precoProd1, quantPc2 * precoProd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
