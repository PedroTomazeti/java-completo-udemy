package estrutura_condicional;

import functions.Inputs;

import java.util.Locale;

public class ExercicioCinco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int codProd, quantProd;
        double preco = 0.0, total;

        System.out.println("1 - Cachorro Quente. R$4.00");
        System.out.println("2 - X-salada. R$4.50");
        System.out.println("3 - X-Bacon. R$5.00");
        System.out.println("4 - Torrada simples. R$2.00");
        System.out.println("5 - Refrigerante. R$1.50");

        codProd = Inputs.intInput("Informe o produto que deseja: ");
        quantProd = Inputs.intInput("Quantos você quer? ");

        if (codProd == 1){
            preco = 4.0;
        } else if (codProd == 2) {
            preco = 4.5;
        } else if (codProd == 3) {
            preco = 5.0;
        } else if (codProd == 4) {
            preco = 2.0;
        } else if (codProd == 5) {
            preco = 1.5;
        }


        total = preco * quantProd;

        System.out.printf("Total: R$ %.2f", total);

    }
}
