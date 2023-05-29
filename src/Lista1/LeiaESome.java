package Lista1;

import java.util.Scanner;

public class LeiaESome {

    // -Leia 5 números
    // -Some os números
    // -Mostre o resultado

    // ? Confirmar como faria isso com for/while ? (Deu certo <3 amigos <3)

    public static void main(String[] args) {

        System.out.println("Olá! Me diga 5 números que farei a soma para você!");

        Scanner leia = new Scanner(System.in);

        double soma = 0;

        int max = 5;

        for(int k = 1; k <= max; k++){
            System.out.println("Qual o " + k + "º número?");
            double num = leia.nextDouble();
            soma = soma + num;
        }

        System.out.println("A soma é: " + soma + "!");
        System.out.println("Tenha um bom dia!");


        /*System.out.println("Qual o primeiro número?");
        double num1 = leia.nextDouble();

        System.out.println("Qual o segundo número?");
        double num2 = leia.nextDouble();

        System.out.println("Qual o terceiro número?");
        double num3 = leia.nextDouble();

        System.out.println("Qual o quarto número?");
        double num4 = leia.nextDouble();

        System.out.println("Qual o quinto número?");
        double num5 = leia.nextDouble();

        System.out.println("Calculando...");

        double soma = num1 + num2 + num3 + num4 + num5;

        System.out.println("A soma é: " + soma + "!");
        System.out.println("Tenha um bom dia!");*/
    }
}
