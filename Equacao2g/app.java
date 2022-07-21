package Equacao2g;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Delta delta = new Delta();
        EqX1X2 eqx1x2 = new EqX1X2();

        System.out.println("Informe o valor de A:");
        delta.setNA(entrada.nextDouble());
        delta.validaEquacao();
        System.out.println("Informe o valor de B:");
        delta.setNB(entrada.nextDouble());
        System.out.println("Informe o valor de C:");
        delta.setNC(entrada.nextDouble());
        delta.calculaDelta();
        if (delta.getDelta() == 0) {
            double x;
            x = -(delta.getNB()) / (2 * delta.getNA());
            System.out.println("------------Resultado Delta------------");
            System.out.println("Delta = " + delta.getDelta());
            System.out.println("------------Raízes da Equação------------");
            System.out.println("x1 = " + x);
            System.out.println("x2 = " + x);
        } else if (delta.getDelta() > 0) {
            System.out.println("------------Resultado Delta------------");
            System.out.println("Delta = " + delta.getDelta());
            System.out.println("------------Raízes da Equação------------");
            System.out.println("x1 :" + eqx1x2.calculaX1(delta));
            System.out.println("x2 :" + eqx1x2.calculaX2(delta));
        } else {
            System.out.println("------------Resultado Delta------------");
            System.out.println("Delta = " + delta.getDelta());
            System.out.println("Não é uma equação do segundo grau!");
        }
        System.out.println("------------Concavidade Parábola------------");
        delta.validaParabola();
        if (delta.getNA() < 0) {
            System.out.println("a < 0, logo a concavidade será para baixo.");
        } else {
            System.out.println("a > 0, logo a concavidade será para cima.");
        }
    }
}