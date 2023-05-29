package Lista3;

import java.util.Scanner;

public class LeiaEMedia {
    public static void main(String[] args) {

        // - Ler n números inteiros

        Scanner resp = new Scanner(System.in);

        System.out.println("Vou fazer a média de quantos números inteiros você quiser!");

        System.out.println("Primeiro me diga: Quantos números você quer?");
        int n = resp.nextInt();

        int num = 1;
        double soma = 0;

        // Tem que deixar a soma como double mesmo sendo só números inteiros porque senão não funciona quando a média resulta em um decimal

        while (num <= n){
            System.out.println("Qual o " + num +"º número inteiro?");
            int numero = resp.nextInt();
            num++;
            soma = soma + numero;
        }

        // - Imprimir média

        double media = (soma / n);

        System.out.println("A soma final é: " + soma);
        System.out.println("A média final é: " + media);
        System.out.println("Tenha um bom dia!");
    }
}
