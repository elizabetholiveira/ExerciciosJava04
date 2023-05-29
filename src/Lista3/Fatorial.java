package Lista3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("Olá! Vamos calcular o fatorial de um número inteiro!");

        Scanner resp = new Scanner(System.in);

        System.out.println("Me diga, qual número inteiro você quer saber o fatorial?");
        int numero = resp.nextInt();

        int num = 1;
        int multiplicacao = 1;

        while ((num >= 1) && (num <= numero)){
            multiplicacao = multiplicacao * num;
            num++;
        }

        System.out.println("O fatorial de " + numero + " é " + multiplicacao + "!");
        System.out.println("Tenha um bom dia!");
    }
}
