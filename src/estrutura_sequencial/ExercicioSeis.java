package estrutura_sequencial;

import functions.Inputs;

import java.util.Locale;

public class ExercicioSeis {

    public static double calcAreaTriang(double base, double altura){

        return (base * altura) / 2;
    }

    public static double calcAreaCirc(double raio){
        double pi = 3.14159;

        return pi * Math.pow(raio, 2);
    }

    public static double calcAreaTrap(double ladoA, double ladoB, double alturaC){

        return (ladoA + ladoB) * alturaC / 2;
    }

    public static double calcAreaQuad(double ladoA){

        return Math.pow(ladoA, 2);
    }

    public static double calcAreaRet(double ladoA, double ladoB){

        return ladoA * ladoB;
    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double a, b, c, areaTriang, areaCirc, areaTrap, areaQuad, areaRet;
        a = Inputs.doubleInput("A= ");
        b = Inputs.doubleInput("B= ");
        c = Inputs.doubleInput("C= ");

        areaTriang = calcAreaTriang(a, c);
        areaCirc = calcAreaCirc(c);
        areaTrap = calcAreaTrap(a, b, c);
        areaQuad = calcAreaQuad(b);
        areaRet = calcAreaRet(a, b);

        System.out.printf("TRIANGULO: %.3f\n", areaTriang);
        System.out.printf("CIRCULO: %.3f\n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaQuad);
        System.out.printf("RETANGULO: %.3f\n", areaRet);
    }
}
