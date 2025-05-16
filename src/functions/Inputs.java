package functions;

import java.util.Scanner;

public class Inputs {
    public static int intInput(String mensagem){
        Scanner sc = new Scanner(System.in);
        int output;

        System.out.print(mensagem);
        output = sc.nextInt();

        return output;
    }

    public static double doubleInput(String mensagem){
        Scanner sc = new Scanner(System.in);
        double output;

        System.out.print(mensagem);
        output = sc.nextDouble();

        return output;
    }
}
