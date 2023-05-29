package Lista1;

import java.util.Scanner;

public class MediaN {

    // -Use o while
    // -Calcular a média de N números
    // -Valor de N é dado pelo usuário

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Me diga quantos números você quer e eu calcularei a média deles!");
        System.out.println("Quantos números você quer?");
        int N = resp.nextInt();

        int primNum = 1;
        double soma = 0;

        while (primNum <= N){
            System.out.println("Qual o " + primNum + "º número?");
            double num = resp.nextDouble();
            primNum++;
            soma = soma + num;
        }

        double media = (soma / N);

        System.out.println("A soma final é: " + soma);
        System.out.println("A média final é: " + media);
        System.out.println("Tenha um bom dia!");

    }
}
